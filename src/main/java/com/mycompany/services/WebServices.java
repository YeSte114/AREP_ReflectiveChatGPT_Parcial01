/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.RequestMapping;

/**
 *
 * @author jeison.barreto
 */
public class WebServices {
    
    @RequestMapping("/client")
    public static String client(){
        return "Hello World";
    }

    @RequestMapping("/Class")
    public static String Class(){
        return "Running";
    }
    
    @RequestMapping("/invoke")
    public static String invoke(){
        return "Invoke";
    }
    
    @RequestMapping("/unaryInvoke")
    public static String unaryInvoke(){
        return "Invoke";
    }
    
    @RequestMapping("/binaryInvoke")
    public static String binaryInvoke(){
        return "Invoke";
    }
    
}
