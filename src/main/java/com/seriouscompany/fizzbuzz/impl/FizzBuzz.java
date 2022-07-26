package com.seriouscompany.fizzbuzz.impl;

import com.seriouscompany.fizzbuzz.impl.factory.BuzzStringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.impl.factory.FizzStringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.impl.factory.NewLineStringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.interfaces.factory.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FizzBuzz {

    private final LoopComponentFactoryInterface loopComponentFactory;
    private final FizzStrategyFactoryInterface fizzStrategyFactory;
    private final FizzStringPrinterFactoryInterface fizzStringPrinterFactory;
    private final BuzzStrategyFactoryInterface buzzStrategyFactory;
    private final BuzzStringPrinterFactoryInterface buzzStringPrinterFactory;

    private final NoFizzNoBuzzStrategyFactoryInterface noFizzNoBuzzStrategyFactory;
    private final IntPrinterFactoryInterface intPrinterFactory;
    private final NewLineStringPrinterFactoryInterface newLineStringPrinterFactory;

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
