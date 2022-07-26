package com.seriouscompany.fizzbuzz.impl.printer;

import com.seriouscompany.fizzbuzz.impl.stringreturner.IntegerStringReturner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IntPrinter {
    private final IntegerStringReturner intStringReturner;

    public void printInteger(final int i) {
        final var printString = intStringReturner.getIntegerString(i);
        System.out.print(printString);
    }
}
