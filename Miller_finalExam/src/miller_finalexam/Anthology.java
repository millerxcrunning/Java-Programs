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
public class Anthology extends Book{
    
    private String editor;
    
    public Anthology()
    {
        super();
        this.editor = null;
    }
    
    public Anthology(String title, int publicationYear, String editor)
    {
        super(title, publicationYear);
        this.editor = editor;
    }

    public String getEditor() 
    {
        return editor;
    }
    
    public void setEditor(String editor) 
    {
        this.editor = editor;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + this.getEditor();   
    }
    
}
