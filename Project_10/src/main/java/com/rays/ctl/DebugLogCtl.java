package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.DebugLogDTO;
import com.rays.form.DebugLogForm;
import com.rays.service.DebugLogServiceInt;

@RestController
@RequestMapping(value = "DebugLog")
public class DebugLogCtl extends BaseCtl<DebugLogForm, DebugLogDTO, DebugLogServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
