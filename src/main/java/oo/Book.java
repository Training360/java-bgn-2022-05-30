package oo;

public class Book {

    private String title;

    private int year;

    private boolean favourite;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Konstruktor overloading
    public Book(Book another) {
        title = another.title;
        year = another.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", favourite=" + favourite +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
