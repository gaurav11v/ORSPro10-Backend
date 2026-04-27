package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.BroadcastDTO;
import com.rays.form.BroadcastForm;
import com.rays.service.BroadcastServiceInt;

@RestController
@RequestMapping(value = "Broadcast")
public class BroadcastCtl extends BaseCtl<BroadcastForm, BroadcastDTO, BroadcastServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");
		map.put(3, "Pending");
		res.addResult("status", map);

		return res;
	}
}
