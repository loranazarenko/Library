
package library.allfactories;

<<<<<<< HEAD
import library.Library;
import library.publishing.Book;

public class BookFactory  implements EditionFactory{

 
    public Library createEdition(Object...a) {

      return new Book((String)a[0],(String) a[1],(int)a[2],(String)a[3],(int) a[4]);
=======
import library.publishing.Books;
import library.Library;

public class BookFactory  implements EditionFactory{
    Books books = new Books(); 
 
    public Library createEdition(Object...a) {

      return books.new Book((String)a[0],(String) a[1],(int)a[2],(String)a[3],(int) a[4]);
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
      
    }
    
    
}
