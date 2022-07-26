package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.printer.BuzzPrinter;
import com.seriouscompany.fizzbuzz.interfaces.factory.StringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuzzStringPrinterFactoryInterface implements StringPrinterFactoryInterface {
    private final BuzzPrinter buzzPrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return buzzPrinter;
    }
}
