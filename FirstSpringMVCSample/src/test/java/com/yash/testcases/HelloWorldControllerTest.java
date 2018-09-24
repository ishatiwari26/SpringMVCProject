package com.yash.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.yash.controller.HelloWorldController;

public class HelloWorldControllerTest {

	private HelloWorldController controllerObj = new HelloWorldController();

	@Test
	public void showMessageHelloWorldController() {
		ModelAndView mv = controllerObj.showMessage("Isha");
		System.out.println(mv.getModel().get("message"));
		System.out.println(mv.getModel().get("name"));
		Assert.assertNotNull(mv);
		Assert.assertEquals("Welcome to Spring MVC!", mv.getModel().get("message"));
		Assert.assertEquals("Isha", mv.getModel().get("name"));
	}

}
