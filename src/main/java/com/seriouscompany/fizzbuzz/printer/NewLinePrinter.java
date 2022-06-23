package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.NewLineStringReturner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewLinePrinter implements StringPrinter {
    private final NewLineStringReturner newLineStringReturner;

    @Override
    public void print() {
        final var printString = newLineStringReturner.getNewLineString();
        System.out.print(printString);
    }
}
