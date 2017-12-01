/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_lab9;

/**
 *
 * @author alexisfletes
 */
public class TestAutomobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automobile vehicle1 = new Automobile();
        Automobile vehicle2 = new Automobile("Chevrolet", "Malibu");
        Automobile vehicle3 = new Automobile("Ford", "Focus", 4, 33);
        
        System.out.println("Vehicle 1 is a " + vehicle1.toString());
        System.out.println("Vehicle 2 is a " + vehicle2.toString());
        System.out.println("Vehicle 3 is a " + vehicle3.toString());
        
        vehicle1.setVehicleMake("Lincoln");
        vehicle1.setVehicleModel("Navigator");
        vehicle1.setNumberCylinders(8);
        vehicle1.setEstMPG(18);
        
        System.out.println(vehicle1.getVehicleMake());
        System.out.println(vehicle1.getVehicleModel());
        System.out.println(vehicle1.getNumberCylinders());
        System.out.println(vehicle1.getEstMPG());
        
    }
    
}
