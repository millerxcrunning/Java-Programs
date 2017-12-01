/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author alexisfletes
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Student> freshman = new ArrayList<>();
        Student student1 = new Student("Mike");
        freshman.add(student1);
        Student student2 = new Student("Mark");
        freshman.add(student2);
        Student student3 = new Student("Matt");
        freshman.add(student3);
        
        LinkedList <Student> csStudents = new LinkedList<>();
        Student student4 = new Student("Sam");
        freshman.add(student4);
        Student student5 = new Student("Steve");
        freshman.add(student5);
        Student student6 = new Student("Mike");
        freshman.add(student6);
        
        LinkedList<Student> all = new LinkedList<>();
        all.addAll(freshman);
        all.addAll(csStudents);
        
        System.out.println("");
        for(Student s: all)
        {
            System.out.println(s);
        }
        
        LinkedList<Student>
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
}
