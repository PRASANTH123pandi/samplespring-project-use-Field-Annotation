package com.sample;

import org.springframework.stereotype.Component;

@Component
public class Monkey implements  Animal{
    @Override
    public void display() {
        System.out.println("Monkey class display method excuted");
    }
}
