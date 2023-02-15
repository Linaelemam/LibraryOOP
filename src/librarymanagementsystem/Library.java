package librarymanagementsystem;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Library {

    Book b = new Book();
    ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Book addBook(int ISBN, String title, String author, String publisher, String publicationDate) {
        b.setISBN(ISBN);
        b.setTitle(title);
        b.setAuthor(author);
        b.setPublisher(publisher);
        b.setPublicationDate(publicationDate);
        listOfBooks.add(b);
        return b;
    }

    public void deleteBook(int ISBN) {
        listOfBooks.remove(listOfBooks.get(ISBN));
    }

    public void searchBook(int ISBN) throws FileNotFoundException {
        String line="";
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\Java Full Stack\\LibraryManagementSystem\\src\\librarymanagementsystem\\Data.txt"));
            for (int i = 0; i < ISBN; i++) {
                br.readLine();
                line = br.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public void displayBooks() {
        String fileName1 = "F:\\Java Full Stack\\LibraryManagementSystem\\src\\librarymanagementsystem\\Data.txt";
        String line;

        try {
            BufferedReader input = new BufferedReader(new FileReader(fileName1));
            if (!input.ready()) {
                //throws new IOException();
            }
            while ((line = input.readLine()) != null) {
                listOfBooks.add(b);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        int sz = listOfBooks.size();
        for (int i = 0; i < sz; i++) {
            System.out.println(listOfBooks.get(i).toString());
        }

    }

    public void storeData() {

        File fileName = new File("F:\\Java Full Stack\\LibraryManagementSystem\\src\\librarymanagementsystem\\Data.txt");
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw) {
            };
            for (int i = 0; i < listOfBooks.size(); i++) {
                output.write(listOfBooks.get(i).toString() + "\n");
            }

            output.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "I cannot create that file");
        }

    }
}
