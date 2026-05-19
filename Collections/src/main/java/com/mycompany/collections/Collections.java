/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collections;
import java.util.*;

/**
 *
 * @author RSS - Siphelele
 */

/*
Problem 1 — Remove Duplicate Numbers
-Create a program that removes duplicates from an array using a Set.
-int[] numbers = {4, 2, 7, 2, 9, 4, 1};
-Expected Output:
-[4, 2, 7, 9, 1]
Requirements:
Use a HashSet
Print only unique numbers
Preserve insertion order if possible
--------------------------------------------------------------------
Problem 2 — Common Elements Between Two Sets

Write a program that finds common elements between two sets.

Input:
Set<Integer> set1 = {1, 2, 3, 4, 5}
Set<Integer> set2 = {4, 5, 6, 7}
Expected Output
Common elements: [4, 5]
Requirements
Use Set methods only
Do not use loops for comparison logic.
Look into:
retainAll()
---------------------------------------------------------------------

Problem 3 — Unique Words Counter

Write a program that counts how many unique words exist in a sentence.

Input
"Java is fun and Java is powerful"
Expected Output
Unique words: 5
Requirements
Ignore case sensitivity (Java and java are the same)
Remove duplicate words using a Set
Split the sentence into words
*/

public class Collections {

    
    
    public static void main(String[] args) {
       
        
        
        /*
        -implementing my solution for problem:1
        -Use Arrays (Class)
        -Auto boxing
        -Automatically prevents duplicate : HashSet
        */
        
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(4, 2, 7, 2, 9, 4, 1));
        
        //using for each loop
        for(Integer s : mySet){
            System.out.println(s);
        }
        System.out.println("\n");
        /*
        Implementing solution for preblem 2:
        */
        
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7));
        
        //we retail all specific elements are contained in both sets, removes others
        set1.retainAll(set2);
        System.out.println("Elements are:"+set1);
        
        System.out.println("\n");
        /*
        implement solution for problem 3:
        -Split that sentence into words, read characters and finds duplicates in each word.
        here we creates a list of words.
        
        new HashSet<>(...)

        Converts the list into a HashSet.
        Duplicate words are automatically removed.
        */
        HashSet<String> stringSet = new HashSet<>(Arrays.asList("Java", "is", "fun", "and", "Java", "is" ,"powerful"));
        
        
        for(String value : stringSet){
            
            //loop through unique values
            System.out.println(value);
            
        }
        //count the unique words
        System.out.println("Unique value are: "+stringSet.size());
    }
    
    
}
