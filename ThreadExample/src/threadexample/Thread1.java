/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

/**
 *
 * @author Michael Miller
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i>500; i++)
        {
            System.out.println("hello " + i);
        }
        
    }  
}
