package com.sopovs.moradanen;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomProviderController {

	@Autowired
	private Provider<SessionBeanWithCustomProvider> firstProvider;

	@RequestMapping("custom")
	@ResponseBody
	public String sayHello() {
		return firstProvider.get().sayHello();
	}

}
