/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author carri_000
 */
public class StudentComparators {

    public static void main(String[] args) {
        Student3 s1 = new Student3("Jane", "Doe");
        Student3 s2 = new Student3("Frank", "Michaels");
        Student3 s3 = new Student3("Jack", "Alexander");
        Student3 s4 = new Student3("Mike", "Frank");
        Student3 s5 = new Student3("Cindy", "Zepher");
        Student3 s6 = new Student3("Abe", "Lincoln");

        List<Student3> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        System.out.println("This is my student list:");
        System.out.println(studentList);
        System.out.println("");

        //MIN
        System.out.println("This is the MIN Student by name: ");
        Student3 min = Collections.min(studentList);
        System.out.println(min.getName());
        System.out.println("");

        //MAX
        System.out.println("This is the MAX Student by name: ");
        Student3 max = Collections.max(studentList);
        System.out.println(max.getName());
        System.out.println("");

        //SORT
        System.out.println("This is my student list sorted:");
        Collections.sort(studentList);
        System.out.println(studentList);
        System.out.println("");

        //REVERSE
        System.out.println("This is my student list in reverse:");
        Collections.reverse(studentList);
        System.out.println(studentList);
        System.out.println("");

        //SHUFFLE
        System.out.println("This is my student list in shuffled:");
        Collections.shuffle(studentList);
        System.out.println(studentList);
        System.out.println("");

        //SWAP
        System.out.println("This is my student list swapped first and last:");
        Collections.swap(studentList, 0, studentList.size() - 1);
        System.out.println(studentList);
        System.out.println("");

        //COMPARATOR
        Collections.sort(studentList, new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        
        System.out.println("This is my student list sorted by Last Name:");
        System.out.println(studentList);
        
    }
}
