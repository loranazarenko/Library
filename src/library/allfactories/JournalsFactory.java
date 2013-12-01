
package library.allfactories;

import library.allfactories.EditionFactory;
<<<<<<< HEAD
import library.Library;
import library.publishing.Journal;
=======
import library.publishing.Journals;
import library.Library;
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858


public class JournalsFactory implements EditionFactory{
    
<<<<<<< HEAD
 
    public Library createEdition(Object...a) {

      return new Journal((String)a[0],(String) a[1],(char)a[2],(int) a[3]);
=======
    Journals journals = new Journals(); 
 
    public Library createEdition(Object...a) {

      return journals.new Journal((String)a[0],(String) a[1],(char)a[2],(int) a[3]);
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
      
    }
    
}
