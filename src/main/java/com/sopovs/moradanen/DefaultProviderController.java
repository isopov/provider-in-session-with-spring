package com.sopovs.moradanen;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultProviderController {

	@Autowired
	private Provider<SessionBeanWithDefaultProvider> firstProvider;

	@RequestMapping("default")
	@ResponseBody
	public String sayHello() {
		return firstProvider.get().sayHello();
	}

}
