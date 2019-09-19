package hacker;

public class Book {
    private String name;
    private String author;
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "-----------------------------\nBook Name:\t" + getName() + "\nAuthor Name:\t" + getAuthor() + "\nISBN:\t" + getIsbn() + "\n-----------------------------";
    }
}
