package org.devshred.rest.services.impl;

import org.devshred.rest.services.GreetingService;

import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String greeting() {
		return "Hello!";
	}

	@Override
	public String greeting(final String name) {
		return String.format("Hello %s!", name);
	}
}
