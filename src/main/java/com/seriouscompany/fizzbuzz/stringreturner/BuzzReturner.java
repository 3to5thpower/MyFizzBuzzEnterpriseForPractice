package com.seriouscompany.fizzbuzz.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class BuzzReturner {
    private static final String BUZZ_STRING = "Buzz";

    public String getBuzz() {
        return BUZZ_STRING;
    }
}
