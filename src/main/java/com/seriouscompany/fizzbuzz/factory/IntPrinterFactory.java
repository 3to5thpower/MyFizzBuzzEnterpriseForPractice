package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.printer.IntPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IntPrinterFactory {
    private final IntPrinter intPrinter;

    public IntPrinter createIntPrinter() {
        return intPrinter;
    }
}
