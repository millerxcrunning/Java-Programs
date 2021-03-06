/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181fa17_project1;

import java.util.Comparator;

/**
 *@author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class MediaItemDateComparator<T extends Comparable> implements Comparator<MediaItem> {

    /**
     *
     * @param t1
     * @param t2
     * @return
     */
    public int compare(MediaItem t1, MediaItem t2) {
        if (t1.getDateLoaned() == null) {
            return 1;
        } else if (t2.getDateLoaned() == null) {
            return -1;
        }

        int i = t1.getDateLoaned().compareTo(t2.getDateLoaned());
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
                return t1.getTitle().compareTo(t2.getTitle());
            }

        }
    }

}
