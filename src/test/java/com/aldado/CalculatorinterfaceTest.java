package com.aldado;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CalculatorinterfaceTest {

    @Test
    public void add(){
        Calculatorinterface calculatorinterface = new Calculatorinterfaceimpl();
        int result = calculatorinterface.add(4, 5);
        Assert.assertEquals(45, result);

        Calculatorinterface im = new ImplTwo();
        int res = im.add(2, 4);
        Assert.assertEquals(14, res);
    }

    @Test
    public void testOne(){
        //precondition
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnyName.class);
        Calculatorinterface calculatorinterface = (Calculatorinterface) applicationContext.getBean("typical");

        //actual test
        int result  = calculatorinterface.add(3, 1);
        Assert.assertEquals(31, result);
    }

}