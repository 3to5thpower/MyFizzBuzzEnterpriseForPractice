package com.seriouscompany.fizzbuzz.impl.strategy;

import org.springframework.stereotype.Component;

@Component
public class FizzStrategy {
    public boolean isFizz(final int i) {
        return i % 3 == 0;
    }
}
