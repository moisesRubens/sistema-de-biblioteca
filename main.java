import java.util.Scanner;

public class main {
    public static void main() {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Colapso", "Roberto Denser"));
        library.addBook(new Book("Código Limpo", "Robert Cecil Martin"));
        library.addBook(new Book("Dexter - A Mão Esquerda de Deus", "Jeff Lindsay"));

        library.addUser(new User("Moisés"));

        while(true) {
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Digite seu nome: ");
                        String nameUser = scanner.nextLine();
                        User user = library.serachUSer(nameUser);

                        if(user != null) {
                            System.out.print("Enter the book title: ");
                            String bookTitle = scanner.nextLine();
                            Book book = library.searchBook(bookTitle);
                                if(book != null) {
                                        if(book.isAvailable()) {
                                            user.takeBook(book);
                                            System.out.println("Book rented.");
                                        } else
                                            System.out.println("This book is not available.");
                                } else {
                                    System.out.println("This book does not exist in the library.");
                                }
                        } else {
                            System.out.println("Você não está cadastrado.");
                        }
                }
        }
    }
}
