package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.strategy.NoFizzNoBuzzStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NoFizzNoBuzzStrategyFactory {
    private final NoFizzNoBuzzStrategy noFizzNoBuzzStrategy;

    public NoFizzNoBuzzStrategy createNoFizzNoBuzzStrategy() {
        return noFizzNoBuzzStrategy;
    }
}
