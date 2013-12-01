
package library.publishing;

import library.observers.Observer;
import java.util.*;
import library.Library;


               
   public class Book implements Comparable<Library>,Library{ 
   private String nameBook;
   private String author;
   private int countPage; 
   private String publishingHouse;  
   private int year;     
      
        private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
        
   
    public Book(String nameBook, String author, int countPage, String publishingHouse, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.countPage = countPage;
        this.publishingHouse = publishingHouse;
        this.year = year;
    }
 

    public String getName() {
        return nameBook;
    }

    public void setName(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

     @Override
        public int compareTo(Library o) {
           return getName().compareTo(o.getName()); 
        }    
        
        public void getInformation() {
     
      System.out.println(this.getName());
      System.out.println(this.getAuthor());
      System.out.println(this.getCountPage());
      System.out.println(this.getPublishingHouse());
      System.out.println(this.getYear());
      notifyObjectModified();
    } 
        
   
   }     
       
            
  
