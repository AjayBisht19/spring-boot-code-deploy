package com.academy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	
	
	@GetMapping("/")
	public String showLoginPage(){
		return "<h1>Deployed application working Properly</h1>";
	}
	
	
}
