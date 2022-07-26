package com.seriouscompany.fizzbuzz.impl.loop;

import com.seriouscompany.fizzbuzz.interfaces.loop.LoopConditionEvaluaterInterface;
import org.springframework.stereotype.Component;

@Component
public class LoopConditionEvaluater implements LoopConditionEvaluaterInterface {
    @Override
    public boolean isLoopRunning(int loopIndex, int end) {
        return loopIndex < end;
    }
}
