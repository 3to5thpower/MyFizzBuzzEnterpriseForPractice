package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.BuzzReturner;
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
