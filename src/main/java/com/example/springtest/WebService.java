package com.example.springtest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class WebService {

    @Async
    public void getName(){
        System.out.println("getName int");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("getName out");
    }

    @Async
    public String getName1(){
        System.out.println("getName1 in");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("getName1 out");
        return "xiecan";
    }

}
