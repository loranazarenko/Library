package library.publishing;

import library.observers.Observer;
import java.util.*;
import library.Library;

 
        
   public class Journal implements Comparable<Library>,Library{ 
   private String nameJournal;
   private String number;
   private char category; 
   private int countPage;     
   private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
   
        
    public Journal(String nameJournal, String number, char category, int countPage) {
        this.nameJournal = nameJournal;
        this.number = number;
        this.countPage = countPage;
        this.category = category;

    }

        public String getName() {
            return nameJournal;
        }

        public void setName(String nameJournal) {
            this.nameJournal = nameJournal;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public char getCategory() {
            return category;
        }

        public void setCategory(char category) {
            this.category = category;
        }

        public int getCountPage() {
            return countPage;
        }

        public void setCountPage(int countPage) {
            this.countPage = countPage;
        }

        @Override
        public int compareTo(Library o) {
            return getName().compareTo(o.getName());
        }
       public void getInformation() {
     
    System.out.println(this.getName());
    System.out.println(this.getNumber());
    System.out.println(this.getCountPage());
    System.out.println(this.getCategory());
    notifyObjectModified();
  }   
    
}
   
   