package com.aldado;

import java.util.*;

public class App {

    public static void main(String[] args) {



        //Question 1

        List listA = new ArrayList();
        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");

        listA.add(0, "element 0");

        for(int Index = 0; Index < listA.size(); Index++){
            System.out.println(listA.get(Index));
        }

        Set setA = new HashSet();

        setA.add("element number 1");
        setA.add("element number 2");
        setA.add("element number 3");

        System.out.println("\nContains name element 2 :" + setA.contains("element number 1"));

        Map mapA = new HashMap();
        mapA.put("key1", "element number 1");
        mapA.put("key2", "element number 2");
        mapA.put("key3", "element number 3");

        String element1 = (String) mapA.get("key1");
        System.out.println("\nElement 1 contains: " + element1);

    }
}
