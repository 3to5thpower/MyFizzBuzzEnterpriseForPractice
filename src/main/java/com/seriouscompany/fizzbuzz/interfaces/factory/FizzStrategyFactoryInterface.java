package com.seriouscompany.fizzbuzz.interfaces.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.FizzStrategy;

public interface FizzStrategyFactoryInterface {
    FizzStrategy createFizzStrategy();
}
