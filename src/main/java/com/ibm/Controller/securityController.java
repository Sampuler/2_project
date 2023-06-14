package com.ibm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {
	@GetMapping("/")
	public String welcome() {
		return "welcome to Ashok it..!";
	}
}
