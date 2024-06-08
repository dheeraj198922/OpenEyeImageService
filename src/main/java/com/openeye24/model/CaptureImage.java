package com.openeye24.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CaptureImage {
	private String employeeId;
	private String employeerAssociateId;
	private boolean capturedSuccessfully;
	private LocalDateTime localDateTime;

}
