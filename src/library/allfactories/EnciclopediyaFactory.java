package library.allfactories;

<<<<<<< HEAD
import library.allfactories.EditionFactory;
import library.Library;
import library.publishing.Encyclopedia;

public class EnciclopediyaFactory implements EditionFactory{
    
 
    public Library createEdition(Object...a) {

      return new Encyclopedia((String)a[0],(int)a[1],(int)a[2],(int) a[3]);
=======
import library.publishing.Encyclopedies;
import library.allfactories.EditionFactory;
import library.Library;

public class EnciclopediyaFactory implements EditionFactory{
    
    Encyclopedies encyclopedies = new Encyclopedies(); 
 
    public Library createEdition(Object...a) {

      return encyclopedies.new Encyclopedia((String)a[0],(int)a[1],(int)a[2],(int) a[3]);
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
      
    }
    
}
