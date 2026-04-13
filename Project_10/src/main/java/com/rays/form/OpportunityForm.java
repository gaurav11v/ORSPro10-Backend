package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OpportunityDTO;

public class OpportunityForm extends BaseForm {

    @NotEmpty(message = "Please enter opportunity code")
	private String opportunityCode;
    
    @NotEmpty(message = "Please enter client name")
	private String clientName;
    
    @NotNull(message = "Please enter amount")
	private Integer amount;
    
    @NotEmpty(message = "Please enter status")
	private String status;
	
	
	public String getOpportunityCode() {
		return opportunityCode;
	}
	public void setOpportunityCode(String opportunityCode) {
		this.opportunityCode = opportunityCode;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		
		OpportunityDTO dto = initDTO(new OpportunityDTO());
		dto.setOpportunityCode(opportunityCode);
		dto.setClientName(clientName);
		dto.setAmount(amount);
		dto.setStatus(status);
		return dto;
	}
}
