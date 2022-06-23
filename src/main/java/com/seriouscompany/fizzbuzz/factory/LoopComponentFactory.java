package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.loop.LoopConditionEvaluater;
import com.seriouscompany.fizzbuzz.loop.LoopInitializer;
import com.seriouscompany.fizzbuzz.loop.LoopStepManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoopComponentFactory {
    private final LoopConditionEvaluater loopConditionEvaluater;
    private final LoopInitializer loopInitializer;
    private final LoopStepManager loopStepManager;

    public LoopConditionEvaluater createLoopConditionEvaluater() {
        return loopConditionEvaluater;
    }

    public LoopInitializer createLoopInitializer() {
        return loopInitializer;
    }

    public LoopStepManager createLoopStepManager() {
        return loopStepManager;
    }
}
