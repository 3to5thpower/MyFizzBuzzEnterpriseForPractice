package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.strategy.FizzStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzStrategyFactory {
    private final FizzStrategy fizzStrategy;

    public FizzStrategy createFizzStrategy() {
        return fizzStrategy;
    }
}
