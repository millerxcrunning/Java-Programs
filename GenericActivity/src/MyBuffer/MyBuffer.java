/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBuffer;

/**
 * CS 1181 
 * @author Michael Miller
 */
public class MyBuffer <T>{
    
    private T [] buffer;
    int count = 0;
    
    public MyBuffer(int size)
    {
        buffer = (T[])new Object[size];
    }
    public void add (T x) throws Exception
    {
        if(count < buffer.length)
        {
            buffer [count] = x;
            count ++;
        }
        else
            throw new Exception("This position does not exist.");
    }
    public T get(int index) throws Exception
    {
        if(index < count)
            return buffer [index];
        else
            throw new Exception("Invalid index");
    }
    
    
    //T[] array = (T[])new Object[SIZE];
    
    
    
    
    
    
}
