package com.seriouscompany.fizzbuzz.impl.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class FizzReturner {
    private static final String FIZZ_STRING = "Fizz";

    public String getFizz() {
        return FIZZ_STRING;
    }
}
