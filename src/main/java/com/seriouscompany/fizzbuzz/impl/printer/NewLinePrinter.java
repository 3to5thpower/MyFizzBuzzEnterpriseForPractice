package com.seriouscompany.fizzbuzz.impl.printer;

import com.seriouscompany.fizzbuzz.impl.stringreturner.NewLineStringReturner;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
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
