package com.openeye24.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.openeye24.model.CaptureImage;
import com.openeye24.model.CapturedImageList;

@Service
public class ImageCaptureService {

	public void captureEmployeeImage(CaptureImage captureImage) {
		List<CaptureImage> captureImageList = CapturedImageList.getCaptureImageList();
		CaptureImage captureImageObj = new CaptureImage("1","dheeraj123", true, LocalDateTime.now());
		CaptureImage captureImageObj2 = new CaptureImage("2","Madhuri1122", false, LocalDateTime.now());
		CaptureImage captureImageObj3 = new CaptureImage("3","Srijan123", true, LocalDateTime.now());

		captureImageList.add(captureImageObj);
		captureImageList.add(captureImageObj2);
		captureImageList.add(captureImageObj3);
	}

	public CaptureImage capturedEmployeeDetails(String employeeId, String date) {
		captureEmployeeImage(null);
		Optional<CaptureImage> findFirst = CapturedImageList.getCaptureImageList().stream()
				.filter(t -> t.getEmployeeId().equals(employeeId)).findFirst();
		if (findFirst.isPresent()) {
			return findFirst.get();
		}
		return null;
	}

}
