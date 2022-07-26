package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.NoFizzNoBuzzStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NoFizzNoBuzzStrategyFactory
        implements com.seriouscompany.fizzbuzz.interfaces.factory
                .NoFizzNoBuzzStrategyFactoryInterface {
    private final NoFizzNoBuzzStrategy noFizzNoBuzzStrategy;

    @Override
    public NoFizzNoBuzzStrategy createNoFizzNoBuzzStrategy() {
        return noFizzNoBuzzStrategy;
    }
}
