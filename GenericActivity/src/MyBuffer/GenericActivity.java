/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBuffer;

/**
 *
 * @author alexisfletes
 */
public class GenericActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        MyBuffer<String> bufferList = new MyBuffer<>(5);
        
        bufferList.add("Alex");
        bufferList.add("Ben");
        bufferList.add("Chris");
        bufferList.add("Doug");
        bufferList.add("Mike");
        //bufferList.add("Paul");
        bufferList.get(0);
        //bufferList.get(6);
    }
    
}
