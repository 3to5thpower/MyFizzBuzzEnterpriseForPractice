package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.strategy.BuzzStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzStrategyFactory {
    private final BuzzStrategy buzzStrategy;

    public BuzzStrategy createBuzzStrategy() {
        return buzzStrategy;
    }
}
