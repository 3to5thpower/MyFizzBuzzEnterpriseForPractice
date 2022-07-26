package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.printer.FizzPrinter;
import com.seriouscompany.fizzbuzz.interfaces.factory.StringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzStringPrinterFactoryInterface implements StringPrinterFactoryInterface {
    private final FizzPrinter fizzPrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return fizzPrinter;
    }
}
