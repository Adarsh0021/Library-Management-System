public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isLent;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isLent = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isLent=" + isLent +
                '}';
    }
}
