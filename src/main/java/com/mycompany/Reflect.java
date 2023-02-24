/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author jeison.barreto
 */
public class Reflect {
    
    
    public static void main(String... args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        String className = args[0];
        Class c = Class.forName(className);
        Method[] declareMethods = c.getDeclaredMethods();

        int passed = 0;
        int failed = 0;

        for (Method m : declareMethods){
            if (m.isAnnotationPresent(Test.class)){
                try {
                    m.invoke(null);
                    passed=passed+1;
                    System.out.println("Invoke: "+m.getName() + " in class: "+c.getName());
                }catch (Exception e){
                    failed = failed+1;
                }


            }
        }
        System.out.println("Passed: "+passed+",failed: "+failed);
    }
    
}