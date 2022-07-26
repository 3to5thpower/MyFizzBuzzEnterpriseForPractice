package com.seriouscompany.fizzbuzz.interfaces.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.BuzzStrategy;

public interface BuzzStrategyFactoryInterface {
    BuzzStrategy createBuzzStrategy();
}
