package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PasswordResetDTO;
import com.rays.form.PasswordResetForm;
import com.rays.service.PasswordResetServiceInt;

@RestController
@RequestMapping(value = "PasswordReset")
public class PasswordResetCtl extends BaseCtl<PasswordResetForm, PasswordResetDTO, PasswordResetServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);

		return res;
	}
}
