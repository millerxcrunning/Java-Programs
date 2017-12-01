/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author carri_000
 */
public class Student3 implements Comparable<Student3> {

    private String firstName;
    private String lastName;

    public Student3(String studentName, String lastName) {
        this.firstName = studentName;
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name, String lastName) {
        this.setFirstName(name);
        this.setLastName(lastName);
    }

    @Override
    public int compareTo(Student3 o) {
        return this.getFirstName().toLowerCase().compareTo(o.getFirstName().toLowerCase());
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
