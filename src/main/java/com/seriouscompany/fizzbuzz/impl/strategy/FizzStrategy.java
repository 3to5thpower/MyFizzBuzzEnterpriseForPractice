package com.seriouscompany.fizzbuzz.impl.strategy;

import com.seriouscompany.fizzbuzz.interfaces.strategy.IsEvenlyDivisibleStrategyInterface;
import org.springframework.stereotype.Component;

@Component
public class FizzStrategy implements IsEvenlyDivisibleStrategyInterface {
    public boolean isEvenlyDivisible(final Integer i) {
        return i % 3 == 0;
    }
}
