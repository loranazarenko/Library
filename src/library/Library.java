
package library;

import library.observers.Observer;
import library.publishing.Newspaper;


public interface Library {
    
    public void addObserver(Observer observer);
    public void notifyObjectModified();
    public void getInformation();
    public String getName();
    public void setName(String name);
    public int compareTo(Library o);
    public void setCountPage(int countPage);
    public int getCountPage();
}
