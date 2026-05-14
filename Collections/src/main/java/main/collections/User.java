/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.collections;

/**
 *
 * @author Reverside
 */
public class User {
    
    //studetn data
    private int id;
    private String name;
    private String course;
    
    //constructor
    User(int id, String nam, String cours){
        this.id = id;
        this.name = nam;
        this.course = cours;
    }
    //apply java encapsulation for data privacy
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    
    //use toString for redable data format
    
    
}
