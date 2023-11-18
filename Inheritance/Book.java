package Inheritance;

public class Book {
    String title, author;
    int publishedYear;

    //Constructor
    public Book(String title, String author, int publishedYear) {
        this.title=title;
        this.author=author;
        this.publishedYear=publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author=author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear=publishedYear;
    }

}
//subclass for general books
class GeneralBook extends Book {
    boolean isAvailableForHome;

    //contructor 
    public GeneralBook(boolean isAvailableForHome) {
        this.isAvailableForHome=isAvailableForHome;
    }



    //methods
}