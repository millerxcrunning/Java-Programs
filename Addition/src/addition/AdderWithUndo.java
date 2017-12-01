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
public class AdderWithUndo extends Adder{
    
    private int lastValueAdded;
    
    public AdderWithUndo() {
        super();
    }
    
    @Override
    public void add(int value)
    {
        total += value;
        lastValueAdded = value;
    }
    
    public void undo()
    {
        total -= lastValueAdded;
    }
}
