package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.loop.LoopConditionEvaluater;
import com.seriouscompany.fizzbuzz.impl.loop.LoopInitializer;
import com.seriouscompany.fizzbuzz.impl.loop.LoopStepManager;
import com.seriouscompany.fizzbuzz.interfaces.factory.LoopComponentFactoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoopComponentFactory implements LoopComponentFactoryInterface {
    private final LoopConditionEvaluater loopConditionEvaluater;
    private final LoopInitializer loopInitializer;
    private final LoopStepManager loopStepManager;

    @Override
    public LoopConditionEvaluater createLoopConditionEvaluater() {
        return loopConditionEvaluater;
    }

    @Override
    public LoopInitializer createLoopInitializer() {
        return loopInitializer;
    }

    @Override
    public LoopStepManager createLoopStepManager() {
        return loopStepManager;
    }
}
