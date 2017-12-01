package miller_1181_project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MediaCollection {

    private ObservableList<Card> collection = FXCollections.observableArrayList();

    public ObservableList<Card> getCollection() {
        return collection;
    }

    
    public Card retrieveItem(int value, int suit) throws Exception {
        
        Card theItem = new Card(value, suit);
        for (Card item : collection) {
            if (item.equals(theItem)) {
                return item;
            }
        }

        throw new Exception("There is no card  " + value + " of " + suit +
                 " in the deck.");
    }
        
        
    public void addItem(int value, int suit) throws Exception {
        
        Card newItem = new Card(value, suit);
        if (!collection.contains(newItem)) {
            collection.add(newItem);
        } else {
            throw new Exception("A card " + value + " of " + suit + 
                    " already exists");
        }
    }

    
    public void removeItem(Card theItem) throws Exception {  
        
        if (collection.contains(theItem)) {
            collection.remove(theItem);
        } else {
            throw new Exception("There is no card " + theItem.getStringRank() +  
                    " of " + theItem.getStringSuit() + " in the deck.");
        }
    }

    
//    public boolean isLoanable(Card theItem) {
//        return (theItem.getLoanedTo() == null);
//    }
    
    
//    public void loanItem(Card theItem, String loanedTo, Date loanedOn) 
//        throws Exception {
//        
//        if (!isLoanable(theItem)) throw new Exception(theItem.getTitle() + 
//                " is already on loan.");
//        theItem.loan(loanedTo, loanedOn);
//    }
//
//    
//    public void returnItem(MediaItem theItem) throws Exception {
//
//        if (theItem.getLoanedTo() == null) {
//            throw new Exception(theItem.getTitle() + " is not on loan");
//        } else {
//            theItem.returnItem();
//        }
//    }

    
    public void listItems() {
        System.out.println("Your Deck");
        for (Card card : collection) {
            System.out.println("\t" + card);
        }
        System.out.println("");
    }

    
    public void storeCollection() throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("data.dat")));) {
            //have to write out as ArrayList. Can not write out as ObservableArrayList.
            oos.writeObject(new ArrayList<Card>(collection));
            oos.close();
        } catch (Exception e) {
            throw new Exception("Unable to save the updates to the deck.");
        }
    }

    
    public void readCollection() throws Exception {

        File f = new File("data.dat");

        if (f.exists()) {
            System.out.println("Going to try opening file");
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("data.dat"));) {
                //cannot read in as observableArrayList, so have to read 
                //in as List, then cast
                //System.out.println("1");
                List<Card> list = (List<Card>)ois.readObject();
                //System.out.println("2");
                //casting list as observableArrayList
                collection = FXCollections.observableArrayList(list);
                System.out.println("Opened file");
                ois.close();
            } catch (Exception e) {
                System.out.println("Unable to load the deck.");
            }
        }
    }
    
//    public void sortByTitle()
//    {
//        Collections.sort(collection);
//    }
//    
//    public void sortByDate()
//    {
//        Collections.sort(collection, new dateCompare());
//    }
    
    public int getSize() {
        return collection.size();
    }
}
