package com.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tiger implements Animal {
     public void display(){
        System.out.println("Tiger class display method excuted");
    }
}
