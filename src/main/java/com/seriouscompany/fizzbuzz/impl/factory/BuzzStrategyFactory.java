package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.BuzzStrategy;
import com.seriouscompany.fizzbuzz.interfaces.factory.BuzzStrategyFactoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzStrategyFactory implements BuzzStrategyFactoryInterface {
    private final BuzzStrategy buzzStrategy;

    @Override
    public BuzzStrategy createBuzzStrategy() {
        return buzzStrategy;
    }
}
