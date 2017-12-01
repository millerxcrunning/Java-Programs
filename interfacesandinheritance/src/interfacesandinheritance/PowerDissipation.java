/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesandinheritance;

/**
 *
 * @author Michael Miller
 */
public interface PowerDissipation {
            
    double powerFromVoltageDrop(double volts) throws Exception;

    double powerFromCurrentDraw(double current) throws Exception;
}
