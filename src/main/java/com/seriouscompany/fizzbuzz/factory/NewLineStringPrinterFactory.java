package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.printer.NewLinePrinter;
import com.seriouscompany.fizzbuzz.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewLineStringPrinterFactory implements StringPrinterFactory {
    private final NewLinePrinter newLinePrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return newLinePrinter;
    }
}
