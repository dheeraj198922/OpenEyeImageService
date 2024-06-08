package com.openeye24.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openeye24.model.CaptureImage;
import com.openeye24.service.ImageCaptureService;

@RestController
@RequestMapping("/images")
public class ImageCaptureController {

	@Autowired
	ImageCaptureService imageCaptureService;

	@GetMapping("/{employeeId}")
	public ResponseEntity<CaptureImage> capturedEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		CaptureImage capturedEmployeeDetails = imageCaptureService.capturedEmployeeDetails(employeeId, LocalDateTime.now().toString());
		return new ResponseEntity<CaptureImage>(capturedEmployeeDetails, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<String> captureEmployeeImage(@RequestBody CaptureImage captureImage) {
		imageCaptureService.capturedEmployeeDetails(null, null);
		imageCaptureService.captureEmployeeImage(captureImage);
		return new ResponseEntity<>("capture successfully", HttpStatus.OK);
	}
}
