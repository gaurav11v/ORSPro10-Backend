package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PolicyDTO;
import com.rays.form.PolicyForm;
import com.rays.service.PolicyServiceInt;

@RestController
@RequestMapping(value = "Policy")
public class PolicyCtl extends BaseCtl<PolicyForm, PolicyDTO, PolicyServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);

		return res;
	}
}
