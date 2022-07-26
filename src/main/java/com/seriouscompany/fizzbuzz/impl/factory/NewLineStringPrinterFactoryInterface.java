package com.seriouscompany.fizzbuzz.impl.factory;

import com.seriouscompany.fizzbuzz.impl.printer.NewLinePrinter;
import com.seriouscompany.fizzbuzz.interfaces.factory.StringPrinterFactoryInterface;
import com.seriouscompany.fizzbuzz.interfaces.printer.StringPrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewLineStringPrinterFactoryInterface implements StringPrinterFactoryInterface {
    private final NewLinePrinter newLinePrinter;

    @Override
    public StringPrinter createStringPrinter() {
        return newLinePrinter;
    }
}
