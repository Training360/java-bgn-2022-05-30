package collections;

public class Book implements Comparable<Book> {

    private String author;

    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        var result = author.compareTo(o.author);
        if (result == 0) {
            result = title.compareTo(o.title);
        }
        return result;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
