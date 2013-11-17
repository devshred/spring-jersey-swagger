package org.devshred.rest.services;

import org.devshred.rest.model.Greeting;

public interface GreetingService {
    Greeting greeting();

    Greeting greeting(String name);
}
