/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1181lab1b;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Adder a1 = new Adder();
        System.out.println(a1);
        a1.add(5);
        System.out.println(a1);
        a1.add(-2);
        System.out.println(a1);

        AdderWithUndo a2 = new AdderWithUndo();
        System.out.println(a2);
        a2.add(14);
        System.out.println(a2);
        a2.add(2);
        System.out.println(a2);
        a2.undo();
        System.out.println(a2);
        a2.undo();
        System.out.println(a2);
    }

}
