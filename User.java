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
        if(book.isAvailable()) {
            rentedBook = book;
            book.setAvailable(false);
        }
        else {
            System.out.println("Livro não disponível.");
        }
    }

    void returnBook() {
        if(rentedBook != null) {
            rentedBook.setAvailable(true);
            rentedBook = null;
            System.out.println("Devolução bem sucedida.");
        }
        else {
            System.out.println("Você não possui um livro alugado para devolver.");
        }
    }
}
