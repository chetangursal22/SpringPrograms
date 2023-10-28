package com.onlyjavatech.durgesh;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String firstHandler()
	{
		return "Testing for Handler";
	}

}
