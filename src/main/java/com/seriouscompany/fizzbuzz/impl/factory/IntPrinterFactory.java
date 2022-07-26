package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.printer.IntPrinter;
import com.seriouscompany.fizzbuzz.interfaces.factory.IntPrinterFactoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IntPrinterFactory implements IntPrinterFactoryInterface {
    private final IntPrinter intPrinter;

    @Override
    public IntPrinter createIntPrinter() {
        return intPrinter;
    }
}
