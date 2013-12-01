
package library;

import library.observers.Observer;
<<<<<<< HEAD
import library.publishing.Newspaper;
=======
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858


public interface Library {
    
    public void addObserver(Observer observer);
    public void notifyObjectModified();
    public void getInformation();
<<<<<<< HEAD
    public String getName();
    public void setName(String name);
    public int compareTo(Library o);
=======
    public void addBook(Library item);
    public void sort();
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
}
