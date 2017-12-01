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
public abstract class Book {
    
    private String title;
    private int publicationYear;
    
    public Book()
    {
        this.title = null;
        this.publicationYear = 1900;
    }
    
    public Book(String title, int publicationYear)
    {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }
    
    public String getTitle() 
    {
        return title;
    }

    public int getPublicationYear() 
    {
        return publicationYear;
    }
    
    @Override
    public String toString()
    {
        return this.title + this.publicationYear;
    }
    
}
