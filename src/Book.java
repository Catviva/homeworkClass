import java.util.Objects;

public class Book {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }

    private String title;
    private Author author;
    private int publishingYear;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;

    }





}
