package com.seriouscompany.fizzbuzz.strategy;

import org.springframework.stereotype.Component;

@Component
public class NoFizzNoBuzzStrategy {
    public boolean isNoFizzNoBuzz(final int i) {
        return i % 3 != 0 && i % 5 != 0;
    }
}
