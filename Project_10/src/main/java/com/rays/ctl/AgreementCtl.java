package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AgreementDTO;
import com.rays.form.AgreementForm;
import com.rays.service.AgreementServiceInt;

@RestController
@RequestMapping(value = "Agreement")
public class AgreementCtl extends BaseCtl<AgreementForm, AgreementDTO, AgreementServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);

		return res;
	}

}
