/*
 * Michael Miller
 * CS 1180 Exam
 * August 1, 2016
 */
package miller_finalexam;

import java.util.ArrayList;

/**
 *
 * @author Michael Miller
 */
public class bookHeirarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Michael Miller, August 1, 2016");
        
        Fiction book1 = new Fiction("fictionBook1", 1950, "Miller");
        Fiction book2 = new Fiction();
        Anthology book3 = new Anthology("anthologyBook1", 1960, "Anderson");
        Anthology book4 = new Anthology();
        
        
        System.out.println(book2.toString());
        
        System.out.println(book4.toString());
        
        book1.setTitle("Earth");
        book1.setAuthor("Alex");
        book1.setPublicationYear(1985);
        
        book3.setTitle("Hemmingway");
        book3.setEditor("Ernst");
        book3.setPublicationYear(1992);
        
        ArrayList <Book> listOfBooks = new ArrayList<Book>();
        
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        
        displayBooks(listOfBooks);
        
    }
    /**
     *
     * @param listOfBooks
     */
    public static void displayBooks(ArrayList <Book> listOfBooks)
        {
        for (Book book: listOfBooks)
                System.out.println(book.toString());
        }
}
        
        
        
        
        
        
                
                
        
        
        
        
    
    

