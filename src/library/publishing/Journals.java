package library.publishing;

import library.observers.Observer;
import java.util.*;
import library.Library;

public class Journals implements Library {
    
    private List<Journal> journals = new ArrayList<Journal>();
    private List<Observer> listeners = new ArrayList<Observer>();
        
        public void addObserver(Observer observer) {
              listeners.add(observer);
}
        
           public void notifyObjectModified(){
             for (Observer listener : listeners) { 
               listener.objectModified(this);
           }
       }
   
     public void addBook(Library journalsNew) {
        journals.add((Journal) journalsNew);
        notifyObjectModified();
}
        
     @Override
    public void getInformation() {
    for(Journal journal:journals){   
    System.out.println(journal.getNameJournal());
    System.out.println(journal.getNumber());
    System.out.println(journal.getCountPage());
    System.out.println(journal.getCategory());
    }
  }    
        
   public class Journal extends Journals implements Comparable<Journal>{ 
   private String nameJournal;
   private String number;
   private char category; 
   private int countPage;     
            
   
    public Journal(String nameJournal, String number, char category, int countPage) {
        this.nameJournal = nameJournal;
        this.number = number;
        this.countPage = countPage;
        this.category = category;

    }

        public String getNameJournal() {
            return nameJournal;
        }

        public void setNameJournal(String nameJournal) {
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
        public int compareTo(Journal o) {
            return getNameJournal().compareTo(o.getNameJournal());
        }
    
    
   }
   
   public void sort(){
       Collections.sort(journals);
    }
    
}
