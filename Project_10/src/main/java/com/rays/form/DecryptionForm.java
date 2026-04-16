package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DecryptionDTO;

public class DecryptionForm extends BaseForm {
	
	@NotEmpty(message = "Please enter decryptionCode")
	private String decryptionCode;
	
	@NotEmpty(message = "Please enter algorithm")
	private String algorithm;
	
	@NotEmpty(message = "Please enter keyUsed")
	private String keyUsed;
	
	@NotEmpty(message = "Please enter status")
	private String status;
	
	
	public String getDecryptionCode() {
		return decryptionCode;
	}
	public void setDecryptionCode(String decryptionCode) {
		this.decryptionCode = decryptionCode;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public String getKeyUsed() {
		return keyUsed;
	}
	public void setKeyUsed(String keyUsed) {
		this.keyUsed = keyUsed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		
		DecryptionDTO dto = initDTO(new DecryptionDTO());
		dto.setDecryptionCode(decryptionCode);
		dto.setAlgorithm(algorithm);
		dto.setKeyUsed(keyUsed);
		dto.setStatus(status);
		
		return dto;
	}
	
}
