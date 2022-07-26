package com.seriouscompany.fizzbuzz.impl.loop;

import org.springframework.stereotype.Component;

@Component
public class LoopConditionEvaluater {
    public boolean isLoopRunning(int loopIndex, int end) {
        return loopIndex < end;
    }
}
