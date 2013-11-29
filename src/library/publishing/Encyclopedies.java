package library.publishing;
import library.observers.Observer;
import java.util.*;
import library.Library;

public class Encyclopedies implements Library {
    
   private List<Encyclopedia> encyclopedies = new ArrayList<Encyclopedia>();
   private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
   
     public void addBook(Library encyclopediaNew) {
        encyclopedies.add((Encyclopedia) encyclopediaNew);
        notifyObjectModified();
}
        
     @Override
    public void getInformation() {
    for(Encyclopedia encyclopedia:encyclopedies){   
    System.out.println(encyclopedia.getNameEncyclopedia());
    System.out.println(encyclopedia.getCountPage());
    System.out.println(encyclopedia.getTome());
    System.out.println(encyclopedia.getYear());
    }
  }    
        
   public class Encyclopedia extends Encyclopedies implements Comparable<Encyclopedia>{ 
   private String nameEncyclopedia;
   private int countPage;  
   private int tome; 
   private int year;         
   
    public Encyclopedia(String nameEncyclopedia, int countPage, int tome, int year) {
        this.nameEncyclopedia = nameEncyclopedia;
        this.countPage = countPage;
        this.tome = tome;
        this.year = year;

    }

        public String getNameEncyclopedia() {
            return nameEncyclopedia;
        }

        public void setNameEncyclopedia(String nameEncyclopedia) {
            this.nameEncyclopedia = nameEncyclopedia;
        }

        public int getCountPage() {
            return countPage;
        }

        public void setCountPage(int countPage) {
            this.countPage = countPage;
        }

        public int getTome() {
            return tome;
        }

        public void setTome(byte tome) {
            this.tome = tome;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public int compareTo(Encyclopedia o) {
           return getNameEncyclopedia().compareTo(o.getNameEncyclopedia());
        }
   
    
   }  
   
   public void sort(){
       Collections.sort(encyclopedies);
    }
   
    
}
