package com.boot.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiVersion")
public class ActionsController {

	@GetMapping("/actions")
	public String actions() {
		return "use GitHub Actions deployment to server.";
	}

}
