package librarymanagementsystem;

import java.io.IOException;
import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Book book = new Book();
        String title, author, publisher, publicationDate;
        int ISBN, exit = 1, choice;
        library.displayBooks();

        System.out.println("Please Choose From Menu:");
        System.out.println(" 1-Add \n 2-Search \n 3-Remove \n 4-Display \n 5-Exit ");
        choice = sc.nextInt();

        while (exit != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Please Enter Book ISBN, Title, Author Name, Publisher and publication date ");
                    ISBN = sc.nextInt();
                    title = sc.next();
                    author = sc.next();
                    publisher = sc.next();
                    publicationDate = sc.next();
                    
                    library.addBook(ISBN, title, author, publisher, publicationDate);
                    break;

                case 2:
                    System.out.println("Please Enter ISBN for a book");
                    ISBN = sc.nextInt();
                    library.searchBook(ISBN);
                    break;

                case 3:
                    System.out.println("Please Enter ISBN for a book");
                    ISBN = sc.nextInt();
                    library.deleteBook(ISBN);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    exit = 0;
                    break;

            }
            if (exit == 0) {
                break;
            }
            System.out.println(" 1-Add \n 2-Search \n 3-Remove \n 4-Display \n 5-Exit ");
            choice = sc.nextInt();
            library.storeData();
        }

    }
}
