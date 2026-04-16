package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UsageDTO;

public class UsageForm extends BaseForm {

	@NotEmpty(message = "please enter Usage Code")
	private String usageCode;
	
	@NotEmpty(message = "please enter User Name")
	private String userName;
	
	@NotEmpty(message = "please enter UsageType")
	private String usageType;
	
	@NotEmpty(message = "please enter Status")
	private String status;
	
	
	public String getUsageCode() {
		return usageCode;
	}
	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsageType() {
		return usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
	 
		UsageDTO dto = initDTO(new UsageDTO());
		dto.setUsageCode(usageCode);
		dto.setUserName(userName);
		dto.setUsageType(usageType);
		dto.setStatus(status);
				
		return dto;
	}
}
