package Rhythm_5767441;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rrhythm
 */
    public class GenTestingData {
    public static void main(String[] args)
    {
        //generate testing data and save them to the file
        UserRegistrationSystem _userSystem = new UserRegistrationSystem();
        BookRegistrationSystem _bookSystem = new BookRegistrationSystem();
      for(int i=0;i<10;i++)
      {
        User user = new User("id"+i,"firstname"+i,"lastname"+i,"username"+i,"password"+i,"usertype"+i);
        _userSystem.addUser(user);
        Book book = new Book("id"+i,"isbn"+i,"callnum"+i,"title"+i,"abs"+i,"publisher"+i,"status"+i);
        _bookSystem.addNewBook(book);
      }

        _userSystem.WriteUserInformationToFile(_userSystem.getAllUser());

        _bookSystem.WriteBookInformationToFile(_bookSystem.getAllBooks());

    }
}