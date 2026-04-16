package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.UsageDTO;
import com.rays.form.UsageForm;
import com.rays.service.UsageServiceInt;

@RestController
@RequestMapping(value = "Usage")
public class UsageCtl extends BaseCtl<UsageForm, UsageDTO, UsageServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
