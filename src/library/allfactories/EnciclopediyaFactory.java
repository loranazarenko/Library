package library.allfactories;

import library.allfactories.EditionFactory;
import library.Library;
import library.publishing.Encyclopedia;

public class EnciclopediyaFactory implements EditionFactory{
    
 
    public Library createEdition(Object...a) {

      return new Encyclopedia((String)a[0],(int)a[1],(int)a[2],(int) a[3]);
      
    }
    
}
