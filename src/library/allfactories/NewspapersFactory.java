
package library.allfactories;

import library.allfactories.EditionFactory;
import library.Library;
<<<<<<< HEAD
import library.publishing.Newspaper;
=======
import library.publishing.Newspapers;
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858


public class NewspapersFactory  implements EditionFactory{
    
<<<<<<< HEAD
  
    public Library createEdition(Object...a) {

      return new Newspaper((String)a[0],(String) a[1],(int)a[2],(String)a[3]);
=======
    Newspapers newspapers = new Newspapers(); 
 
    public Library createEdition(Object...a) {

      return newspapers.new Newspaper((String)a[0],(String) a[1],(int)a[2],(String)a[3]);
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
      
    }
}
