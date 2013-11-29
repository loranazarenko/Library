
package library.allfactories;

import library.publishing.Books;
import library.Library;

public class BookFactory  implements EditionFactory{
    Books books = new Books(); 
 
    public Library createEdition(Object...a) {

      return books.new Book((String)a[0],(String) a[1],(int)a[2],(String)a[3],(int) a[4]);
      
    }
    
    
}
