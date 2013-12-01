package library;

<<<<<<< HEAD

import library.observers.Observers;
import library.allfactories.EditionFactory;
import library.allfactories.BookFactory;
import library.publishing.*;
=======
import library.publishing.Newspapers;
import library.publishing.Journals;
import library.publishing.Encyclopedies;
import library.observers.Observers;
import library.allfactories.EditionFactory;
import library.allfactories.BookFactory;
import library.publishing.Books;
import library.publishing.Books.Book;
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858


public class TestLibrary {
     
   public static void main(String[] args) {
       
<<<<<<< HEAD

    
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
=======
   Books books = new Books();  
   Newspapers newspapers = new Newspapers();
   Journals journals = new Journals();  
   Encyclopedies encyclopedies = new Encyclopedies();
       
   Library bookFirst  = books.new Book("Story Java","King",700,"TimeNews",2004);
   Library bookSecond = books.new Book("Tiles Java","Rose",540,"WordJava",2012);
   
   Library newspaperFirst  = newspapers.new Newspaper("News Java","10/12",10,"12.10.12");
   Library newspaperSecond = newspapers.new Newspaper("Rules Java","10-12",12,"15.10.12");
   
   Library journalFirst  = journals.new Journal("nowa Java","01/J",'E',50);
   Library journalSecond = journals.new Journal("each Java","17-60",'D',36);
   
   Library encyclopediaFirst  = encyclopedies.new Encyclopedia("ALL Java",1540,1,2004);
   Library encyclopediaSecond = encyclopedies.new Encyclopedia("ANY Java",2000,2,2015);
   
    Observers ob1 = new Observers();
          
   books.addObserver(ob1);
   
   books.addBook(bookFirst);
   books.addBook(bookSecond);
   newspapers.addBook(newspaperFirst);
   newspapers.addBook(newspaperSecond);
   journals.addBook(journalFirst);
   journals.addBook(journalSecond);
   encyclopedies.addBook(encyclopediaFirst);
   encyclopedies.addBook(encyclopediaSecond);
   
   books.sort();
   newspapers.sort();
   journals.sort();
   encyclopedies.sort();  
   
   books.getInformation();
   newspapers.getInformation();
   journals.getInformation();
   encyclopedies.getInformation();
   
    EditionFactory ef = new BookFactory();
    Library bookThird = ef.createEdition("True story Java","myEdition",330,"Zorya",2013);
    books.addBook(bookThird);
    books.getInformation();
    
>>>>>>> 0d37a0f39c4285a4aca13235ddaf2f5457a05858
   
 }
   
     
}  

