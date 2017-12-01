package miller_1181_project2;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class MediaItem implements Serializable, Comparable<MediaItem> {
    
    private String title;
    private String format;
    private String loanedTo;
    private Date dateLoaned;
    
    public MediaItem(String title, String format) {
        this.title = title;
        this.format = format;
    }
    
    public void loan(String loanedTo, Date loanedOn) {
        this.loanedTo = loanedTo;
        this.dateLoaned = loanedOn;
    }
    
    public void returnItem() {
        this.loanedTo = null;
        this.dateLoaned = null;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Date getDateLoaned() {
        return dateLoaned;
    }
    
    @Override
    public String toString() {
        String response = title + " - " + format;
        
        if (loanedTo != null) {
            response += " (" + loanedTo + " on " + dateLoaned + ")";
        }
        
        response = response.replace("00:00:00 EDT ", "");
        return response;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //if this is obj
        if (this == obj) {
            return true;
        }
        //if obj doesn't exist
        if (obj == null) {
            return false;
        }
        //if this and obj don't are not of the same class
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //at this point, obj has to be of the same class as this, so I can cast
        //obj to MediaItem class
        final MediaItem other = (MediaItem) obj;
        //if the titles of the two MediaItems are different 
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        //the titles of the two MediaItems are the same
        return true;
    }
    
    public String getLoanedTo() { return loanedTo; }

    @Override
    public int compareTo(MediaItem o) {
        /*sorts this and o based on title... 
        1 if this.title comes before o.title
        0 if this.title is the same as o.title
        -1 if this.title comes after o.title
        */
        return this.title.compareToIgnoreCase(o.title);
        
        }
    static class dateCompare< T extends Comparable> implements Comparator<MediaItem>
    {
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        //if o1 is not loaned, put it in front
        if(o1.getDateLoaned()==null)
            return 1;
        //if o2 is not loaned, put it in front
        else if (o2.getDateLoaned()==null)
            return -1;
        
        int i = o1.getDateLoaned().compareTo(o2.getDateLoaned());
        {
            if(i != 0)
            {
                //return i;
                if (i > 0)
                {
                    return 1;
                }
                else if (i<0)
                {
                    return -1;
                }
                return -1;
            }
            
            else return o1.getTitle().compareTo(o2.getTitle());

    }
    
}
    }
}


