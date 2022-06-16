package com.seriouscompany.fizzbuzz.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class IntegerStringReturner {
    public String getIntegerString(final int i) {
        final var integer = Integer.valueOf(i);
        return integer.toString();
    }
}
