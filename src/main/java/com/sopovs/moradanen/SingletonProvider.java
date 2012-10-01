package com.sopovs.moradanen;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonProvider {

	@Autowired
	private Provider<PrototypeBean> prototypePojoProvider;

	public PrototypeBean get() {
		return prototypePojoProvider.get();
	}

}
