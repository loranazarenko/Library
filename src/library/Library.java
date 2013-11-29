
package library;

import library.observers.Observer;


public interface Library {
    
    public void addObserver(Observer observer);
    public void notifyObjectModified();
    public void getInformation();
    public void addBook(Library item);
    public void sort();
}
