package com.ca.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private String name = "name";
    private final String useName = "useName";

    public final void say() {
        System.out.println("hello" + "=" + name + "=" + useName);


    }

    public void hu() {
        System.out.println("hello" + "=" + name + "=" + useName);

    }
}
