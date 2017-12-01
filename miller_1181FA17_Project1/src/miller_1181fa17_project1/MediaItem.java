/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181fa17_project1;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 *@author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MediaItem other = (MediaItem) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    @Override
    public int compareTo(MediaItem o) {

        return this.title.compareToIgnoreCase(o.title);

    }

    static class dateCompare< T extends Comparable> implements Comparator<MediaItem> {

        @Override
        public int compare(MediaItem o1, MediaItem o2) {

            if (o1.getDateLoaned() == null) {
                return 1;
            } else if (o2.getDateLoaned() == null) {
                return -1;
            }

            int i = o1.getDateLoaned().compareTo(o2.getDateLoaned());
            {
                if (i != 0) {
                    //return i;
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return -1;
                } else {
                    return o1.getTitle().compareTo(o2.getTitle());
                }

            }

        }
    }
}
