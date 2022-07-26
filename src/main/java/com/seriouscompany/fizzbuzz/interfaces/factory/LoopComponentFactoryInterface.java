package com.seriouscompany.fizzbuzz.interfaces.factory;

import com.seriouscompany.fizzbuzz.impl.loop.LoopConditionEvaluater;
import com.seriouscompany.fizzbuzz.impl.loop.LoopInitializer;
import com.seriouscompany.fizzbuzz.impl.loop.LoopStepManager;

public interface LoopComponentFactoryInterface {
    LoopConditionEvaluater createLoopConditionEvaluater();

    LoopInitializer createLoopInitializer();

    LoopStepManager createLoopStepManager();
}
