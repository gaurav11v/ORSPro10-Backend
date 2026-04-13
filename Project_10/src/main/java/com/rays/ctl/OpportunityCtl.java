package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.OpportunityDTO;
import com.rays.form.OpportunityForm;
import com.rays.service.OpportunityServiceInt;

@RestController
@RequestMapping(value = "Opportunity")
public class OpportunityCtl extends BaseCtl<OpportunityForm, OpportunityDTO, OpportunityServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
