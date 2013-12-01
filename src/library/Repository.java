
package library;
import java.util.*;
import library.*;
import library.allfactories.*;
import library.observers.Observers;
import library.publishing.*;


public class Repository  implements Comparable<Library>{
     private List<Library> items = new ArrayList<Library>();
    
   public Repository(Library... items) {
        this.items = Arrays.asList(items);
    }
    Observers ob1 = new Observers();
    public Repository() {
        EditionFactory ef = new BookFactory();
        Library bookF = ef.createEdition("True story Java","myEdition",330,"Zorya",2013);
        add(bookF);
        bookF.addObserver(ob1);
        
        EditionFactory jf = new JournalsFactory();
        Library journalF = jf.createEdition("Nowa Java","01/J",'E',50);
        add(journalF);
        EditionFactory enf = new EnciclopediyaFactory();
        Library enciclopediyaF = enf.createEdition("All Java",1540,1,2004);
        add(enciclopediyaF);
        EditionFactory nf = new NewspapersFactory();
        Library newspapersF = nf.createEdition("News Java","10/12",10,"12.10.12");
        add(newspapersF);
    }

    public void add(Library item) {
        if (items == null)
            items = new ArrayList();
        items.add(item);
    }
    

    public void getInformation() {
        for (Library item : items) {
            item.getInformation();
        }
    }
 

    public void sort(){ 
    Collections.sort(items, new Comparator<Library>() {
       public int compare(Library o1, Library o2) {
       return o1.getName().compareTo(o2.getName());
  }
}); 
     
}
    @Override
    public int compareTo(Library o) {
        return compareTo(o);
    }
    
}
