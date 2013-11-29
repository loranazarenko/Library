package library.allfactories;

import library.publishing.Encyclopedies;
import library.allfactories.EditionFactory;
import library.Library;

public class EnciclopediyaFactory implements EditionFactory{
    
    Encyclopedies encyclopedies = new Encyclopedies(); 
 
    public Library createEdition(Object...a) {

      return encyclopedies.new Encyclopedia((String)a[0],(int)a[1],(int)a[2],(int) a[3]);
      
    }
    
}
