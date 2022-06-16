package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.NewLineStringReturner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewLinePrinter {
    private final NewLineStringReturner newLineStringReturner;

    public void printNewLine() {
        final var printString = newLineStringReturner.getNewLineString();
        System.out.print(printString);
    }
}
