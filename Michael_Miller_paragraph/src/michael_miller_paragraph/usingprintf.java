/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michael_miller_paragraph;

/**
 *
 * @author alexisfletes
 */
public class usingprintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String yourName;// This allocates memory for "yourName"
        int yourAge;// This allocates memory for "yourAge"
        String yourCity;// This allocates memory for "yourCity"
        String yourCollege;// This allocates memory for "yourCollege"
        String yourProfession;// This allocates memory for "yourProfession"
        String yourAnimalType;// This allocates memory for "yourAnimalType"
        String yourPetName;// This allocates memory for "yourPetName"
        
        
        System.out.printf("THERE ONCE WAS A PERSON NAMED %s WHO LIVED IN %s. AT ",yourName,yourCity);
        //System.out.println();
        System.out.printf("THE AGE OF %d, %s WENT TO COLLEGE AT %s.",yourAge,yourName,yourCollege);
        System.out.println("");
        System.out.printf("%s GRADUATED AND WENT TO WORK AS %s.",yourName,yourProfession);
        System.out.println("");
        System.out.printf("THEN %s ADOPTED A %s NAMED ",yourName,yourAnimalType);
        System.out.println("");
        System.out.printf("%s. %s and %s LIVED",yourPetName,yourName,yourPetName);
        System.out.println("");
        System.out.printf("HAPPILY EVER AFTER.");
    }
    
}
