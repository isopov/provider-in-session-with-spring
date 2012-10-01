package com.sopovs.moradanen;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SessionBeanWithDefaultProvider {

	@Autowired
	private Provider<PrototypeBean> prototypePojoProvider;

	public String sayHello() {
		return "Hello " + this.hashCode() + " with " + prototypePojoProvider.get().hashCode();
	}
}
