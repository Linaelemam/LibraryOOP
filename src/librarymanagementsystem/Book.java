/*=;.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

public class Book {
    private int ISBN;
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    
    public Book(){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setISBN(int ISBN) {
        if(ISBN <0)
            System.out.println("Invalid ISBN ");
        else this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublicationDate(String publicationDate) {
        if(publicationDate.indexOf('/')==2 && publicationDate.indexOf('/')==5)
            System.out.println("Wrong format date");
        else this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", publicationDate=" + publicationDate + '}';
    }

   
    
}
