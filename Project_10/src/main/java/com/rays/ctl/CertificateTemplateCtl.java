package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CertificateTemplateDTO;
import com.rays.form.CertificateTemplateForm;
import com.rays.service.CertificateTemplateServiceInt;

@RestController
@RequestMapping(value = "CertificateTemplate")
public class CertificateTemplateCtl extends BaseCtl<CertificateTemplateForm, CertificateTemplateDTO, CertificateTemplateServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
	
}
