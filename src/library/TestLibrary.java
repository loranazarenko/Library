package library;


import library.observers.Observers;
import library.allfactories.EditionFactory;
import library.allfactories.BookFactory;
import library.publishing.*;


public class TestLibrary {
     
   public static void main(String[] args) {
       

    
//   Library bookFirst  = new Book("Story Java","King",700,"TimeNews",2004);
//   Library bookSecond = new Book("Tiles Java","Rose",540,"WordJava",2012);
//   
//   Library newspaperFirst  = new Newspaper("News Java","10/12",10,"12.10.12");
//   Library newspaperSecond = new Newspaper("Rules Java","10-12",12,"15.10.12");
//   
//   Library journalFirst  = new Journal("nowa Java","01/J",'E',50);
//   Library journalSecond = new Journal("each Java","17-60",'D',36);
//   
//   Library encyclopediaFirst  = new Encyclopedia("ALL Java",1540,1,2004);
//   Library encyclopediaSecond = new Encyclopedia("ANY Java",2000,2,2015);
//   
//    Observers ob1 = new Observers();
//          
//   bookFirst.addObserver(ob1);
//   

    
    Repository rep = new Repository();
    rep.sort();
    rep.getInformation();
   
 }
   
     
}  

