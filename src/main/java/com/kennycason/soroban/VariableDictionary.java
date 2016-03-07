package com.kennycason.soroban;

import com.kennycason.soroban.number.BigRational;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenny on 3/1/16.
 *
 * An variable dictionary
 */
public class VariableDictionary {
    private static final Map<String, BigRational> VARIABLES = new HashMap<>();

    private VariableDictionary() {}

    public static void set(final String variable, final BigRational value) {
        VARIABLES.put(variable, value);
    }

    public static BigRational get(final String variable) {
        return VARIABLES.get(variable);
    }

    public static void clearAll() {
        VARIABLES.clear();
    }

    public static boolean isSet(final String variable) {
        return VARIABLES.containsKey(variable);
    }

}