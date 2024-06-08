package com.openeye24.model;

import java.util.ArrayList;
import java.util.List;

public class CapturedImageList {

	private static List<CaptureImage> captureImageList;
	
	static {
		CapturedImageList.captureImageList = new ArrayList<CaptureImage>();
		
	}

	public static List<CaptureImage> getCaptureImageList() {
		return captureImageList;
	}

	public static void setCaptureImageList(List<CaptureImage> captureImageList) {
		CapturedImageList.captureImageList = captureImageList;
	}

}
