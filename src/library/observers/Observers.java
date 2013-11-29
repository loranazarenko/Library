
package library.observers;

import library.observers.Observer;


public class Observers  implements Observer{
    
    @Override
    public void objectModified(Object obj) {
       System.out.println("Changes in the class BOOK");
    }
    
}
