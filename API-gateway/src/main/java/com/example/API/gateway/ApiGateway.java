package com.example.API.gateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGateway {
	@GetMapping("/test")
	public String test() {
		return "Gateway is working";
	}
}
