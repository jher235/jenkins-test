package hello.testjenkins.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@Value("${spring.config.color}")
	private String color;

	@Value("${server.port}")
	private String serverPort;

	@Value("${server.serverAddress}")
	private String serverAddress;


	@GetMapping("/health")
	public String healthCheck(){
		return "200";
	}

	@GetMapping("/color")
	public String colorCheck(){
		return color;
	}

	@GetMapping("/String")
	public String sstring(){
		return color + " : " + serverPort + " : " + serverAddress;
	}

}
