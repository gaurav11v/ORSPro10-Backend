package com.rays.form;

import javax.validation.constraints.NotEmpty;


import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ThemeDTO;

public class ThemeForm extends BaseForm {
    
	@NotEmpty(message = "Please enter Theme Code")
	private String themeCode;
	
	@NotEmpty(message = "Please enter Theme Name")
	private String themeName;
	
	@NotEmpty(message = "Please enter Color")
	private String color;
	
	@NotEmpty(message = "Please enter Status")
	private String status;
	
	
	public String getThemeCode() {
		return themeCode;
	}
	public void setThemeCode(String themeCode) {
		this.themeCode = themeCode;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		ThemeDTO dto = initDTO(new ThemeDTO());
		dto.setThemeCode(themeCode);
		dto.setThemeName(themeName);
		dto.setColor(color);
		dto.setStatus(status);
		
		return dto;
	}
}
