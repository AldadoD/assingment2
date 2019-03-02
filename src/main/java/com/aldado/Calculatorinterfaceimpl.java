package com.aldado;

public class Calculatorinterfaceimpl implements Calculatorinterface {
    @Override
    public int add(int a, int b) {
        return Integer.parseInt(String.valueOf(a) + String.valueOf(b));
    }
}
