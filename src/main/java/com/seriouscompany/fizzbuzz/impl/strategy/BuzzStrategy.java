package com.seriouscompany.fizzbuzz.impl.strategy;

import org.springframework.stereotype.Component;

@Component
public class BuzzStrategy {
    public boolean isBuzz(final int i) {
        return i % 5 == 0;
    }
}
