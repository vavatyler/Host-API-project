package com.lopez.rafael.MessageServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Spring Boot + Maven + Jenkins + AWS!";
    }
}
