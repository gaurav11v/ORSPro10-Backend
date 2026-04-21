package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PolicyDTO;

public class PolicyForm extends BaseForm {

	@NotEmpty(message = "please enter Policy Name")
	private String policyName;

	@NotNull(message = "please enter Premium Amount")
	private Integer premiumAmount;

	@NotNull(message = "please enter Start Date")
	private Date startDate;

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public Integer getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public BaseDTO getDto() {
		PolicyDTO dto = initDTO(new PolicyDTO());
		dto.setPolicyName(policyName);
		dto.setPremiumAmount(premiumAmount);
		dto.setStartDate(startDate);

		return dto;
	}

}
