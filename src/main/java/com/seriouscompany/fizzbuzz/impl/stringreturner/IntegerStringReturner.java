package com.seriouscompany.fizzbuzz.impl.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class IntegerStringReturner {
    public String getIntegerString(final int i) {
        final var integer = Integer.valueOf(i);
        return integer.toString();
    }
}
