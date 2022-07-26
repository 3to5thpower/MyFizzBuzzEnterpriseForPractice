package com.seriouscompany.fizzbuzz.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final var ctx = SpringApplication.run(Main.class, args);
        final var fb = ctx.getBean(FizzBuzz.class);
        fb.fizzbuzz(100);
    }
}
