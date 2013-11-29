
package library.allfactories;

import library.Library;
import library.publishing.Book;

public class BookFactory  implements EditionFactory{

 
    public Library createEdition(Object...a) {

      return new Book((String)a[0],(String) a[1],(int)a[2],(String)a[3],(int) a[4]);
      
    }
    
    
}
