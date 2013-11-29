
package library.allfactories;

import library.allfactories.EditionFactory;
import library.Library;
import library.publishing.Journal;


public class JournalsFactory implements EditionFactory{
    
 
    public Library createEdition(Object...a) {

      return new Journal((String)a[0],(String) a[1],(char)a[2],(int) a[3]);
      
    }
    
}
