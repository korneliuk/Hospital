package com.solvd.specialWordCounter;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class SpecialWordCounter {

    SpecialWordCounter(){}

    private static class Helper {
        private static final SpecialWordCounter INSTANCE = new SpecialWordCounter();
    }

    public SpecialWordCounter getInstance() {
        return Helper.INSTANCE;
    }

    private static final ISpecial special = (String word) -> {
        return StringUtils.isAlpha(word) && Character.isUpperCase(word.charAt(0));
    };

    // Made invoke non-static just to demonstrate singleton design pattern
    public int invoke(String[] text) {
        return (int) Arrays.stream(text).filter(special::isSpecial).count();
    }
}