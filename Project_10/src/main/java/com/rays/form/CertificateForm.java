package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CertificateDTO;

public class CertificateForm extends BaseForm{

	@NotEmpty(message = "please enter certificate number")
	private String certificateNumber;
	
	@NotEmpty(message = "please enter issue to whom")
	private String issuedTo;
	
	@NotNull(message = "please enter issue date")
	private LocalDate issueDate;
	
	@NotEmpty(message = "please enter certificate status")
	private String certificateStatus;
	
	public String getCertificateNumber() {
		return certificateNumber;
	}
	
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public String getIssuedTo() {
		return issuedTo;
	}
	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public String getCertificateStatus() {
		return certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}
	
	@Override
	public BaseDTO getDto() {
		
		CertificateDTO dto = initDTO(new CertificateDTO());
		dto.setCertificateNumber(certificateNumber);
		dto.setIssuedTo(issuedTo);
		dto.setIssueDate(issueDate);
		dto.setCertificateStatus(certificateStatus);
		return dto;
	}
}
