
package library.allfactories;

import library.allfactories.EditionFactory;
import library.publishing.Journals;
import library.Library;


public class JournalsFactory implements EditionFactory{
    
    Journals journals = new Journals(); 
 
    public Library createEdition(Object...a) {

      return journals.new Journal((String)a[0],(String) a[1],(char)a[2],(int) a[3]);
      
    }
    
}
