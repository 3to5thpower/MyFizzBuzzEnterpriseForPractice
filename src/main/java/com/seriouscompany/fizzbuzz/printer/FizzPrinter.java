package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.FizzReturner;
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
