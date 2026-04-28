package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AgreementDTO;

public class AgreementForm extends BaseForm {

	@NotEmpty(message = "please enter Party Name")
	private String partyName;

	@NotNull(message = "please enter Start Date")
	private Date signedDate;

	@NotEmpty(message = "please enter Terms")
	private String terms;

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public Date getSignedDate() {
		return signedDate;
	}

	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	@Override
	public BaseDTO getDto() {
		AgreementDTO dto = initDTO(new AgreementDTO());
		dto.setPartyName(partyName);
		dto.setSignedDate(signedDate);
		dto.setTerms(terms);
		return dto;
	}

}
