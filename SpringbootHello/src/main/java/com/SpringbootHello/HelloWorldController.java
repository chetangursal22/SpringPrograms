package com.SpringbootHello;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	@GetMapping("/hello")
	public String SayHello(Map<String,String>model)
	{
	model.put("msg", "Hello world");
	return "hello_world";
		
	}

}
