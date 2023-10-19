package com.jsp.OneToOneFingerPrint.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FingerPrintDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fingerPrintId;
	private String fingerPrint;
	
}
