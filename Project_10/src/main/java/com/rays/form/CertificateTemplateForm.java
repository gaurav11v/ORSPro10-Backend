package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CertificateTemplateDTO;

public class CertificateTemplateForm extends BaseForm {

	@NotEmpty(message = "please enter template name")
	private String templateName;

	@NotEmpty(message = "please enter format")
	private String format;

	@NotNull(message = "please enter create date")
	private Date createdDate;

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public BaseDTO getDto() {

		CertificateTemplateDTO dto = initDTO(new CertificateTemplateDTO());
		dto.setTemplateName(templateName);
		dto.setFormat(format);
		dto.setCreatedDate(createdDate);
		return dto;
	}

}
