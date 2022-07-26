package com.seriouscompany.fizzbuzz.impl.printer;

import com.seriouscompany.fizzbuzz.impl.stringreturner.BuzzReturner;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzPrinter implements StringPrinter {
    private final BuzzReturner buzzReturner;

    @Override
    public void print() {
        final var printString = buzzReturner.getBuzz();
        System.out.print(printString);
    }
}
