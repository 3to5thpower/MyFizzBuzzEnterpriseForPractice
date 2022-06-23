package com.seriouscompany.fizzbuzz.factory;

import com.seriouscompany.fizzbuzz.printer.BuzzPrinter;
import com.seriouscompany.fizzbuzz.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzStringPrinterFactory implements StringPrinterFactory {
    private final BuzzPrinter buzzPrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return buzzPrinter;
    }
}
