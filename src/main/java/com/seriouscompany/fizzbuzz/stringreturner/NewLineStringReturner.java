package com.seriouscompany.fizzbuzz.stringreturner;

import org.springframework.stereotype.Component;

@Component
public class NewLineStringReturner {
    private static final String NEWLINE = System.getProperty("line.separator");

    public String getNewLineString() {
        return NEWLINE;
    }
}
