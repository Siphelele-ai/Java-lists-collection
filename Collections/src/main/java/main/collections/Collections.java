/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.collections;
import java.util.*;
import java.io.*;
/**
 *
 * @author Reverside
 */
public class Collections {

    public static void main(String[] args) {
        
        //Create list on students
        //creates an empty object list
        List<User> list = new ArrayList<>();
        
        //add students into an object list
        list.add(new User(1, "siphelele", "IT"));
        list.add(new User(2, "John", "Compuater"));
        list.add(new User(3, "Zintle", "Accounting"));
        
        //use for each loop, displaying 
        
        for(User u : list){
            System.out.println(u.getId()+" | "+u.getName()+" | "+u.getCourse());
        }
        
        try{
        //use iterator to loop over a list, and for save removals of objects
        Iterator<User> iter = list.iterator();
        Scanner sc = new Scanner(System.in);
        
        //search student by id
        System.out.println("enter id:");
        int user_id = sc.nextInt();
        System.out.println("seaching for Id: "+ user_id);
        while(iter.hasNext()){
            User user = iter.next();
            if(user.getId() == user_id){
                System.out.println("student found: "+ user.getName());
            }
        }
        }catch(Exception e){
            
            System.out.println("student not found in list.");
        }
        
    }
}
