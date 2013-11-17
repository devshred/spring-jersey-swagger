package org.devshred.rest.services.impl;

import org.devshred.rest.model.Greeting;
import org.devshred.rest.services.GreetingService;
import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public Greeting greeting() {
        return new Greeting();
    }

    @Override
    public Greeting greeting(final String name) {
        return new Greeting(name);
    }
}
