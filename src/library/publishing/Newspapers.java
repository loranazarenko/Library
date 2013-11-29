package library.publishing;
import library.observers.Observer;
import java.util.*;
import library.Library;

public class Newspapers  implements Library {
    
     private List<Newspaper> newspapers = new ArrayList<Newspaper>();
     private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
   
     public void addBook(Library newspaperNew) {
        newspapers.add((Newspaper) newspaperNew);
        notifyObjectModified();
}
        
     @Override
    public void getInformation() {
    for(Newspaper newspaper:newspapers){   
    System.out.println(newspaper.getNameNewspaper());
    System.out.println(newspaper.getNumber());
    System.out.println(newspaper.getCountPage());
    System.out.println(newspaper.getDateString());
    }
  }    
        
   public class Newspaper extends Newspapers implements Comparable<Newspaper>{ 
   private String nameNewspaper;
   private String number;
   private int countPage; 
   private String dateString;     
            
   
    public Newspaper(String nameNewspaper, String number, int countPage, String dateString) {
        this.nameNewspaper = nameNewspaper;
        this.number = number;
        this.countPage = countPage;
        this.dateString = dateString;

    }

        public String getNameNewspaper() {
            return nameNewspaper;
        }

        public void setNameNewspaper(String nameBook) {
            this.nameNewspaper = nameNewspaper;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public int getCountPage() {
            return countPage;
        }

        public void setCountPage(int countPage) {
            this.countPage = countPage;
        }

        public String getDateString() {
            return dateString;
        }

        public void setDateString(String dateString) {
            this.dateString = dateString;
        }
        
       @Override
        public int compareTo(Newspaper o) {
            return getNameNewspaper().compareTo(o.getNameNewspaper());
        }
   
   } 
    public void sort(){
       Collections.sort(newspapers);
    }
   
}
