package com.seriouscompany.fizzbuzz.impl.loop;

import com.seriouscompany.fizzbuzz.interfaces.loop.LoopStepManagerInterface;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class LoopStepManager implements LoopStepManagerInterface {
    private static final int LOOP_INCREMENT_VALUE = 1;

    @Override
    public int stepLoop(int i) {
        return i + LOOP_INCREMENT_VALUE;
    }
}
