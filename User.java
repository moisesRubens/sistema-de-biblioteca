public class User {
    private String name;
    private Book rentedBook;

    User(String name) {
        this.name = name;
        rentedBook = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getRentedBook() {
        return rentedBook;
    }

    public void setRentedBook(Book takeBook) {
        this.rentedBook = takeBook;
    }

    public void takeBook(Book book) {
        if(book != null) {
            if (book.isAvailable()) {
                rentedBook = book;
                book.setAvailable(false);
                System.out.println("Book rented");
            }
            else
                System.out.println("Livro não disponível.");

        }
        else
            System.out.println("Book does not exist at the library.");
    }

    void returnBook() {
        if(rentedBook != null) {
            rentedBook.setAvailable(true);
            rentedBook = null;
            System.out.println("Book returned.");
        }
        else {
            System.out.println("You do not have a book to return.");
        }
    }
}
