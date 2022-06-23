package com.seriouscompany.fizzbuzz;

import com.seriouscompany.fizzbuzz.factory.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FizzBuzz {

    private final LoopComponentFactory loopComponentFactory;
    private final FizzStrategyFactory fizzStrategyFactory;
    private final FizzStringPrinterFactory fizzStringPrinterFactory;
    private final BuzzStrategyFactory buzzStrategyFactory;
    private final BuzzStringPrinterFactory buzzStringPrinterFactory;

    private final NoFizzNoBuzzStrategyFactory noFizzNoBuzzStrategyFactory;
    private final IntPrinterFactory intPrinterFactory;
    private final NewLineStringPrinterFactory newLineStringPrinterFactory;

    public void fizzbuzz(int number) {
        final var loopInitializer = loopComponentFactory.createLoopInitializer();
        final var loopStepManager = loopComponentFactory.createLoopStepManager();
        final var loopConditionEvaluater = loopComponentFactory.createLoopConditionEvaluater();

        final var fizzStrategy = fizzStrategyFactory.createFizzStrategy();
        final var fizzStringPrinter = fizzStringPrinterFactory.createStringPrinter();

        final var buzzStrategy = buzzStrategyFactory.createBuzzStrategy();
        final var buzzStringPrinter = buzzStringPrinterFactory.createStringPrinter();

        final var noFizzNoBuzzStrategy = noFizzNoBuzzStrategyFactory.createNoFizzNoBuzzStrategy();
        final var intPrinter = intPrinterFactory.createIntPrinter();

        final var newLineStringPrinter = newLineStringPrinterFactory.createStringPrinter();

        for (var i = loopInitializer.getLoopInitializationPoint();
                loopConditionEvaluater.isLoopRunning(i, number);
                i = loopStepManager.stepLoop(i)) {
            if (fizzStrategy.isFizz(i)) {
                fizzStringPrinter.print();
            }
            if (buzzStrategy.isBuzz(i)) {
                buzzStringPrinter.print();
            }
            if (noFizzNoBuzzStrategy.isNoFizzNoBuzz(i)) {
                intPrinter.printInteger(i);
            }
            newLineStringPrinter.print();
        }
    }
}
