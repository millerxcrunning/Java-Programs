/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project1;

import java.util.Date;

/**
 *
 * @author Michael Miller
 */
public class Item implements Comparable
{

    private String title;
    private String format;
    private boolean onLoan;
    private String loanedTo;
    private Date dateLoaned;
    
    public Item()
    {
        this.title = null;
        this.format = null;
        this.onLoan = false;
        this.loanedTo = "";
        this.dateLoaned = null;
    }
    
    public Item(String title, String format)
    {
            this.title = title;
            this.format = format;
            this.onLoan = false;
            this.loanedTo = "";
            this.dateLoaned = null;              
    }
    
    public Item(String title, String format, boolean onLoan, String loanedTo, Date dateLoaned)
    {
            this.title = title;
            this.format = format;
            this.onLoan = onLoan;
            this.loanedTo = loanedTo;
            this.dateLoaned = dateLoaned;
    }

    
    public void setTitle(String title)
    {
     this.title = title;   
    }
    
    public String getTitle() {
        return title;
    }

    public void setFormat(String format)
    {
     this.format = format;
    }
    
    public String getFormat() {
        return format;
    }

    
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public boolean getOnLoan() {
        return onLoan;
    }

    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    public void setDateLoaned(Date dateLoaned) {
        this.dateLoaned = dateLoaned;
    }

    public Date getDateLoaned() {
        return dateLoaned;
    }
    
    @Override
    public boolean equals(Object o)
    {
       Item title = (Item) o;
        
       if (!(o instanceof Item))
       {
            throw new IllegalArgumentException("The argument should be of Item Type");
       } 
       
       if(this.getTitle().equalsIgnoreCase(title.getTitle()))     
           {
           return true;
           }
       
       else
       {
           return false;
       }
    }
    
    @Override
    public int compareTo(Object o) throws IllegalArgumentException 
    {
        Item title = (Item) o;
        
        if (!o.equals("Item"))
        {
            throw new IllegalArgumentException("The argument should be of Item Type");
        }
        
        if (!(o instanceof Item))
            {
                throw new IllegalArgumentException("The argument should be of Item Type");
            }
        
        int result = this.title.compareToIgnoreCase(title.getTitle());
            
            if (result != 0)
            {
                return result;
            }
            
            return this.getTitle().compareToIgnoreCase(title.getTitle());
        }
    
    @Override
    public String toString()
    {
        return "Title: " + this.title + "Format: " + this.format + "Loan Status: " + 
                this.onLoan + "Date Loaned: " + this.dateLoaned;
    }
}
    
    

