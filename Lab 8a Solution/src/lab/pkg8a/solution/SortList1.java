/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8a.solution;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;

/**
 *
 * @author Michael Miller
 */
public class SortList1 implements Runnable{

    ArrayList<Double> list;
    
    public SortList1(ArrayList<Double> list){
        this.list = list;
    }
    
    @Override
    public void run() {
    
        Collections.sort(list);
        
    }
    
}
