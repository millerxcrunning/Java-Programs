/*
 * Michael Miller
 * CS 1180 Exam
 * August 1, 2016 
 */
package miller_finalexam;

/**
 *
 * @author Michael Miller
 */
public class Fiction extends Book{
    
    private String author;
   
    public Fiction()
    {
        super();
        this.author = null;
    }
    
    public Fiction(String title, int publicationYear, String author)
    {
        super (title, publicationYear);
        this.author = author;
    }
    
    public void setAuthor(String author) 
    {
        this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String toString()
    {
        return super.toString() + this.getAuthor();
    }
}
