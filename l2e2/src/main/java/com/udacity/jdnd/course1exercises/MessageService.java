package com.udacity.jdnd.course1exercises;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {
    private String message;

    public MessageService(String message)
    {
        this.message=message;
    }

    public String uppercase()
    {
        return this.message.toUpperCase();
    }
    public String lowercase()
    {
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postconstruct()
    {
        System.out.println("Create this string after bean is injected");
    }

}
