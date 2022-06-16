package com.seriouscompany.fizzbuzz;

public class FizzBuzz {
    public void fizzbuzz(int number) {
        for(int i = 0; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
