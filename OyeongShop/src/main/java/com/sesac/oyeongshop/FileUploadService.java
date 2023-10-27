package com.sesac.oyeongshop;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/*
 * 파일 업로드시 파일명이 동일한 파일이 이미 존재할 수도 있고, 사용자가 업로드 하는 파일명이 언어 이외의 언어로 되어있을 수 있다. 또한
 * 타언어를 지원하지 않는 환경에서도 정상 동작이 되도록 고유한 랜덤 문자를 부여해 db와 서버에 새로운 파일명으로 저장한다.
 */
@Service
public class FileUploadService {

	// 단일파일 업로드
	public String fileUpload(HttpServletRequest request, MultipartFile file) {
		// 1. 파일명 얻기(+a 사이즈 확인) : 파일확장자를 확인하기 위해
		String fileRealName = file.getOriginalFilename();

		// 2. 확장자 얻기: 파일명에서 fileExtension으로 .png 같은 확장자를 구함
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());

		// 3. 새로운 파일명으로 부여할 랜덤 문자 생성
		String[] uuids = UUID.randomUUID().toString().split("-");
		String uniqueName = uuids[0] + fileExtension;

		// 4. 업로드할 실제 경로 찾기
		String uploadFolder = request.getServletContext().getRealPath("/upload");

		// 5. 저장할 파일로 만드는 작업
		File saveFile = new File(uploadFolder + File.separator + uniqueName);

		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		return uniqueName;
	}

	// (참고)다중파일 업로드 :: 단일 파일 업로드를 반복하면된다.
	public void fileUpload(HttpServletRequest request, List<MultipartFile> files) {
		for (MultipartFile file : files) {
			String fileRealName = file.getOriginalFilename();
			String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());
			String[] uuids = UUID.randomUUID().toString().split("-");
			String uniqueName = uuids[0] + fileExtension;
			String uploadFolder = request.getServletContext().getRealPath("/upload");
			File saveFile = new File(uploadFolder + File.separator + uniqueName);
			try {
				file.transferTo(saveFile);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}

	}

}
