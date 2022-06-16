package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.FizzReturner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzPrinter {
    private final FizzReturner fizzReturner;

    public void printFizz() {
        final var printString = fizzReturner.getFizz();
        System.out.print(printString);
    }
}
