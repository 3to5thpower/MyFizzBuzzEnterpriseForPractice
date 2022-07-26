package com.seriouscompany.fizzbuzz.impl.loop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@Component
public class LoopInitializer {
    private static final int LOOP_INITIALIZATION_POINT = 1;

    public int getLoopInitializationPoint() {
        return LOOP_INITIALIZATION_POINT;
    }
}
