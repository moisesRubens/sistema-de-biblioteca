import java.util.ArrayList;

public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;

    Library() {
        users = new ArrayList<User>();
        books = new ArrayList<Book>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Livro '" + book.getName() + "' adicionado.");
    }

    public Book searchBook(String title) {
        for(Book book: books) {
            if(book.getName().equals(title))
                return book;
        }
        System.out.println("Livro não existente na biblioteca.");
        return null;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("Usuário cadastrado.");
    }

    public User serachUSer(String name) {
        for(User user: users) {
            if(user.getName().equals(name))
                    return user;
        }
        System.out.println("Usuário não identificado.");
        return null;
    }
}
