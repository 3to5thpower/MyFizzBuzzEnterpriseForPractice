package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.FizzStrategy;
import com.seriouscompany.fizzbuzz.interfaces.factory.FizzStrategyFactoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzStrategyFactory implements FizzStrategyFactoryInterface {
    private final FizzStrategy fizzStrategy;

    @Override
    public FizzStrategy createFizzStrategy() {
        return fizzStrategy;
    }
}
