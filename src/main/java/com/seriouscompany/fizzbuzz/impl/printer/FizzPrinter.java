package com.seriouscompany.fizzbuzz.impl.printer;

import com.seriouscompany.fizzbuzz.impl.stringreturner.FizzReturner;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzPrinter implements StringPrinter {
    private final FizzReturner fizzReturner;

    @Override
    public void print() {
        final var printString = fizzReturner.getFizz();
        System.out.print(printString);
    }
}
