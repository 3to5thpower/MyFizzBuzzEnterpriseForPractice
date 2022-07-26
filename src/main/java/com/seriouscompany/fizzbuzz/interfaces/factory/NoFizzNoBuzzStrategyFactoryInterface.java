package com.seriouscompany.fizzbuzz.interfaces.factory;

import com.seriouscompany.fizzbuzz.impl.strategy.NoFizzNoBuzzStrategy;

public interface NoFizzNoBuzzStrategyFactoryInterface {
    NoFizzNoBuzzStrategy createNoFizzNoBuzzStrategy();
}
