package com.angus.codewars;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Matrix {
    public static void enter() {
        //throw a checked exception without adding a "throws"
        getUnsafe().throwException(new Neo());
    }

    private static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
