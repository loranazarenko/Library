package library.publishing;
import library.observers.Observer;
import java.util.*;
import library.Library;

   
        
   public class Newspaper  implements Comparable<Library>,Library { 
   private String nameNewspaper;
   private String number;
   private int countPage; 
   private String dateString;     

     private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
    
    public Newspaper(String nameNewspaper, String number, int countPage, String dateString) {
        this.nameNewspaper = nameNewspaper;
        this.number = number;
        this.countPage = countPage;
        this.dateString = dateString;

    }

        public String getName() {
            return nameNewspaper;
        }

        public void setName(String nameBook) {
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
        public int compareTo(Library o) {
            return getName().compareTo(o.getName());
        }
   
       public void getInformation() {
   
    System.out.println(this.getName());
    System.out.println(this.getNumber());
    System.out.println(this.getCountPage());
    System.out.println(this.getDateString());
 
  }   
       
       
   } 
    
   

