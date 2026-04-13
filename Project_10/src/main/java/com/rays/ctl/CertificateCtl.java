package com.rays.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CertificateDTO;
import com.rays.dto.CourseDTO;
import com.rays.form.CertificateForm;
import com.rays.service.CertificateServiceInt;

@RestController
@RequestMapping(value = "Certificate")
public class CertificateCtl extends BaseCtl<CertificateForm, CertificateDTO, CertificateServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
