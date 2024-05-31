import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void lendBook(String ISBN, String userId) {
        Book book = findBookByISBN(ISBN);
        User user = findUserById(userId);

        if (book != null && user != null) {
            if (!book.isLent()) {
                book.setLent(true);
                System.out.println("Book " + book.getTitle() + " lent to " + user.getName());
            } else {
                System.out.println("Book " + book.getTitle() + " is already lent out.");
            }
        } else {
            System.out.println("Book or User not found.");
        }
    }

    private Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    private User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "1234567891");

        library.addBook(book1);
        library.addBook(book2);

        User user1 = new User("Alice", "U001");
        User user2 = new User("Bob", "U002");

        library.addUser(user1);
        library.addUser(user2);

        library.listBooks();
        library.listUsers();

        library.lendBook("1234567890", "U001");
        library.lendBook("1234567891", "U002");

        library.listBooks();
    }
}
