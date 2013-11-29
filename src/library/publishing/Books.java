
package library.publishing;

import library.observers.Observer;
import java.util.*;
import library.Library;


public class Books implements Library {
        private List<Book> books = new ArrayList<Book>();
        private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
       
    
        public void addBook(Library bookNew) {
              books.add((Book) bookNew);
              notifyObjectModified();
}
        
     @Override
    public void getInformation() {
    for(Book book:books){   
    System.out.println(book.getNameBook());
    System.out.println(book.getAuthor());
    System.out.println(book.getCountPage());
    System.out.println(book.getPublishingHouse());
    System.out.println(book.getYear());
    }
  }    

               
   public class Book extends Books  implements Comparable<Book>{ 
   private String nameBook;
   private String author;
   private int countPage; 
   private String publishingHouse;  
   private int year;     
            
   
    public Book(String nameBook, String author, int countPage, String publishingHouse, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.countPage = countPage;
        this.publishingHouse = publishingHouse;
        this.year = year;
    }
 

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
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
        public int compareTo(Book o) {
           return getNameBook().compareTo(o.getNameBook()); 
        }
   
    } 
   
            
   public void sort(){
       Collections.sort(books);
    }
    
  
 
}
