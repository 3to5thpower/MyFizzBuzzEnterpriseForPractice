package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.printer.FizzPrinter;
import com.seriouscompany.fizzbuzz.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FizzStringPrinterFactory implements StringPrinterFactory {
    private final FizzPrinter fizzPrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return fizzPrinter;
    }
}
