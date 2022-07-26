package com.seriouscompany.fizzbuzz.impl.loop;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class LoopStepManager {
    private static final int LOOP_INCREMENT_VALUE = 1;

    public int stepLoop(int i) {
        return i + LOOP_INCREMENT_VALUE;
    }
}
