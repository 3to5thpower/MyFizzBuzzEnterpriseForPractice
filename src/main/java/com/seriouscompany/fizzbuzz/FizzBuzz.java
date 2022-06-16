package com.seriouscompany.fizzbuzz;

import com.seriouscompany.fizzbuzz.loop.LoopConditionEvaluater;
import com.seriouscompany.fizzbuzz.loop.LoopInitializer;
import com.seriouscompany.fizzbuzz.loop.LoopStepManager;
import com.seriouscompany.fizzbuzz.printer.BuzzPrinter;
import com.seriouscompany.fizzbuzz.printer.FizzPrinter;
import com.seriouscompany.fizzbuzz.printer.IntPrinter;
import com.seriouscompany.fizzbuzz.printer.NewLinePrinter;
import com.seriouscompany.fizzbuzz.strategy.BuzzStrategy;
import com.seriouscompany.fizzbuzz.strategy.FizzStrategy;
import com.seriouscompany.fizzbuzz.strategy.NoFizzNoBuzzStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzBuzz {

    // loop managers
    private final LoopInitializer loopInitializer;
    private final LoopStepManager loopStepManager;
    private final LoopConditionEvaluater loopConditionEvaluater;

    // string printers
    private final FizzPrinter fizzPrinter;
    private final BuzzPrinter buzzPrinter;
    private final IntPrinter intPrinter;
    private final NewLinePrinter newLinePrinter;

    //
    private final FizzStrategy fizzStrategy;
    private final BuzzStrategy buzzStrategy;
    private final NoFizzNoBuzzStrategy noFizzNoBuzzStrategy;

    public void fizzbuzz(int number) {
        for (var i = loopInitializer.getLoopInitializationPoint();
                loopConditionEvaluater.isLoopRunning(i, number);
                i = loopStepManager.stepLoop(i)) {
            if (fizzStrategy.isFizz(i)) {
                fizzPrinter.printFizz();
            }
            if (buzzStrategy.isBuzz(i)) {
                buzzPrinter.printBuzz();
            }
            if (noFizzNoBuzzStrategy.isNoFizzNoBuzz(i)) {
                intPrinter.printInteger(i);
            }
            newLinePrinter.printNewLine();
        }
    }
}
