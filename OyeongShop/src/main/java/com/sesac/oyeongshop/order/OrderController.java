package com.sesac.oyeongshop.order;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.dto.UserDTO;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	// productDetail에서 buyNow버튼 눌렀을때 -> 값만 넘겨주면 됨!(색상,사이즈,수량)
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String buy(String mainImg, String productName, int price, String color, String size, int quantity,
			int productId, Model model) {
		model.addAttribute("mainImg", mainImg);
		model.addAttribute("productName", productName);
		model.addAttribute("price", price);
		model.addAttribute("color", color);
		model.addAttribute("size", size);
		model.addAttribute("quantity", quantity);
		model.addAttribute("productId", productId);
		return "order";
	}

	@RequestMapping(value = "/orderSuccess.do", method = RequestMethod.GET)
	public String orderPayment(OrderDTO orderdto, OrderDetailDTO detaildto, HttpSession session) {
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String userId = dto.getUserId();

		System.out.println("orderdto::" + orderdto);

		int orderId = service.insert(userId, orderdto.getReceiveName(), orderdto.getReceivePhone(),
				orderdto.getZonecode(), orderdto.getAddress(), orderdto.getAddressDetail(), orderdto.getAddressExtra());

		// 여기에 service.insertDetail
		detaildto.setOrderId(orderId);
		service.insertDetail(detaildto);
		return "redirect:/orderSuccess?orderId=" + orderId;
	}

	@RequestMapping(value = "/orderSuccess", method = RequestMethod.GET)
	public String orderSuccess(Model model, int orderId) {
		System.out.println("(컨트롤러)주문번호::" + orderId);
		OrderDTO order = service.getOrderList(orderId);
		model.addAttribute("order", order);
		return "orderSuccess";
	}

	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String orderList() {
		return "orderList";
	}

	// mypage-orderlist 또는 결제완료페이지-주문내역보기 눌렀을때 -> action(db에서 셀렉트)
	@RequestMapping(value = "/orderList.do", method = RequestMethod.GET)
	public String getMyOrder(HttpSession session, Model model) {
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String userId = dto.getUserId();

		List<OrderDTO> myorders = service.getMyOrder(userId);
		model.addAttribute("myorders", myorders);

		System.out.println("컨트롤ㄹ러내주문내역!!!" + myorders);
		return "orderList";
	}

}
