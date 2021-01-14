package com.nikhil.bookshelves;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value={"application.properties"})
public class GreetingsController {

	@Value("${my.greeting}")
	private String greetingMessage;
	
	@GetMapping("/greeting")
	public String greeting() {
		return "my.greeting " + greetingMessage;
	}
}
