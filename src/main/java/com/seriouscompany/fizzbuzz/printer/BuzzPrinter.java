package com.seriouscompany.fizzbuzz.printer;

import com.seriouscompany.fizzbuzz.stringreturner.BuzzReturner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzPrinter {
    private final BuzzReturner buzzReturner;

    public void printBuzz() {
        final var printString = buzzReturner.getBuzz();
        System.out.print(printString);
    }
}
