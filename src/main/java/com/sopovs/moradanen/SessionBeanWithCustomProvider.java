package com.sopovs.moradanen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SessionBeanWithCustomProvider {

	@Autowired
	private SingletonProvider prototypePojoProvider;

	public String sayHello() {
		return "Hello " + this.hashCode() + " with " + prototypePojoProvider.get().hashCode();
	}
}
