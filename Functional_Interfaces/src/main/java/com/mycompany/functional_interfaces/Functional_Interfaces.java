/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.functional_interfaces;

import java.util.*;
/**
 *
 * @author RSS - Siphelele
 */
public class Functional_Interfaces {

    public static void main(String[] args) {
       
        /*
        Understanfing functional interfaces
        When working with functional interfaces, they go hand in hand
        with collections such as list
        Stream API allows you to proccess collections more easly
        */
        
        /*
        generic - allows a collection to store string elements 
        or objects
        */
        List<String> list = Arrays.asList("john", "smith", "lisa");
        
        /*
        Optional is a container that may contain a value or may be empty.

        It helps avoid:

        NullPointerException
        */
        Optional<String> result = 
                list.stream()
                .filter(name -> name.startsWith("j"))
                .findFirst();
                
        
        System.out.println(result.orElse("Not Found"));
        
        
    }
}
