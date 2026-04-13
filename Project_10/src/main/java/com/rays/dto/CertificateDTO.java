package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CERTIFICATE")
public class CertificateDTO extends BaseDTO {
	
	@Column(name = "CERTIFICATE_NUMBER", length = 50)
	private String certificateNumber;
	
	@Column(name = "ISSUED_TO", length = 50)
	private String issuedTo;
	
	@Column(name = "ISSUE_DATE")
	private LocalDate issueDate;
	
	@Column(name = "CERTIFICATE_STATUS", length = 50)
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
	//For preload
	public String getValue() {     
		return certificateNumber;
	}

	@Override
	public String getUniqueKey() {
		return "certificateNumber";
	}

	@Override
	public String getUniqueValue() {
		return certificateNumber;
	}

	@Override
	//For business validation
	public String getLabel() {
		return "certificateNumber";
	}

	@Override
	// it sets list in ascending order
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("certificateNumber", "asc");
		
		return map;	
		} 

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("certificateNumber", certificateNumber);
		return map;
	}

}
