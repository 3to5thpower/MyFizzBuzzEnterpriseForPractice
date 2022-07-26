package com.seriouscompany.fizzbuzz.impl.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class NewLineStringReturner {
    private static final String NEWLINE = System.getProperty("line.separator");

    public String getNewLineString() {
        return NEWLINE;
    }
}
