package com.arshad.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MessageResource {

    @Value("${message: Default Hello}")
    private String message;

    @Value("${message2: Default Hi}")
    private String message2;

    @GetMapping("/message")
    public String message() {
        return message;
    }

    @GetMapping("/message2")
    public String message2() { return message2; }

}