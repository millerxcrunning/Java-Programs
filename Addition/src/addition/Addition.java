/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author Michael Miller
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 

        Adder adder = new Adder();
        System.out.println(adder);
        adder.add(3);
        System.out.println(adder);
        adder.add(-5);
        System.out.println(adder);

        AdderWithUndo adder2 = new AdderWithUndo();
        System.out.println(adder2);
        adder2.add(10);
        System.out.println(adder2);
        adder2.add(20);
        System.out.println(adder2);
        adder2.undo();
        System.out.println(adder2);
        adder2.undo();
        System.out.println(adder2);
    }

}
