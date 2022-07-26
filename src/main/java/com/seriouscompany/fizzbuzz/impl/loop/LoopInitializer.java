package com.seriouscompany.fizzbuzz.impl.loop;

import com.seriouscompany.fizzbuzz.interfaces.loop.LoopInitializerInterface;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@Component
public class LoopInitializer implements LoopInitializerInterface {
    private static final int LOOP_INITIALIZATION_POINT = 1;

    @Override
    public int getLoopInitializationPoint() {
        return LOOP_INITIALIZATION_POINT;
    }
}
