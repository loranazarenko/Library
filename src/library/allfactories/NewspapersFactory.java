
package library.allfactories;

import library.allfactories.EditionFactory;
import library.Library;
import library.publishing.Newspapers;


public class NewspapersFactory  implements EditionFactory{
    
    Newspapers newspapers = new Newspapers(); 
 
    public Library createEdition(Object...a) {

      return newspapers.new Newspaper((String)a[0],(String) a[1],(int)a[2],(String)a[3]);
      
    }
}
