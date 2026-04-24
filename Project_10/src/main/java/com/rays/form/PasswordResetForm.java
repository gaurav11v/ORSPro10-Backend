package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PasswordResetDTO;

public class PasswordResetForm extends BaseForm {

	@NotEmpty(message = "Please enter Reset Code")
	private String resetCode;

	@NotEmpty(message = "Please enter UserName")
	private String userName;

	@NotEmpty(message = "Please enter ResetToken")
	private String resetToken;

	@NotEmpty(message = "Please enter Status")
	private String status;

	public String getResetCode() {
		return resetCode;
	}

	public void setResetCode(String resetCode) {
		this.resetCode = resetCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		PasswordResetDTO dto = initDTO(new PasswordResetDTO());
		dto.setResetCode(resetCode);
		dto.setUserName(userName);
		dto.setResetToken(resetToken);
		dto.setStatus(status);

		return dto;
	}
}
