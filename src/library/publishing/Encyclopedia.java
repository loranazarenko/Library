package library.publishing;
import library.observers.Observer;
import java.util.*;
import library.Library;

  
        
   public class Encyclopedia  implements Comparable<Library>,Library{ 
   private String nameEncyclopedia;
   private int countPage;  
   private int tome; 
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
   
    
    public Encyclopedia(String nameEncyclopedia, int countPage, int tome, int year) {
        this.nameEncyclopedia = nameEncyclopedia;
        this.countPage = countPage;
        this.tome = tome;
        this.year = year;

    }

        public String getName() {
            return nameEncyclopedia;
        }

        public void setName(String nameEncyclopedia) {
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
        public int compareTo(Library o) {
           return getName().compareTo(o.getName());
        }
      public void getInformation() {
      
    System.out.println(this.getName());
    System.out.println(this.getCountPage());
    System.out.println(this.getTome());
    System.out.println(this.getYear());
    notifyObjectModified();
  }    
    
 }  
   
   
