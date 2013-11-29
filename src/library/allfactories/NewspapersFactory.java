
package library.allfactories;

import library.allfactories.EditionFactory;
import library.Library;
import library.publishing.Newspaper;


public class NewspapersFactory  implements EditionFactory{
    
  
    public Library createEdition(Object...a) {

      return new Newspaper((String)a[0],(String) a[1],(int)a[2],(String)a[3]);
      
    }
}
