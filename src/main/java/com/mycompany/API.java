/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jeison.barreto
 */
public class API {
    static Map<String, Method> services = new HashMap<String, Method>();

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        String className = args[0];
        Class c = Class.forName(className);

        for (Method m : c.getDeclaredMethods()){
            if (m.isAnnotationPresent(RequestMapping.class)){
                try {
                    String URI = m.getAnnotation(RequestMapping.class).value();
                    System.out.println(URI);
                    System.out.println("URI: " + URI + " ,Method: " + m);
                    services.put(URI, m);

                } catch (Throwable ex){
                    ex.printStackTrace();
                }
            }
        }
        System.out.println(services.get("/client").invoke(null));

    }
}

