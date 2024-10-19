import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Colapso", "Roberto Denser"));
        library.addBook(new Book("Código Limpo", "Robert Cecil Martin"));
        library.addBook(new Book("Dexter - A Mão Esquerda de Deus", "Jeff Lindsay"));

        library.addUser(new User("Moisés"));
        library.addUser(new User("Maria Clara"));

        while(true) {
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter your name: ");
                    String userName = scanner.nextLine();
                    User user = library.searchUSer(userName);

                    if(user != null) {
                        System.out.print("Enter the book title: ");
                        String bookTitle = scanner.nextLine();
                        Book book = library.searchBook(bookTitle);
                        user.takeBook(book);
                    }
                    else
                        System.out.println("You need to register at the library.");
                    break;

                case 2:
                    System.out.println("Enter your name: ");
                    String userName1 = scanner.nextLine();
                    User user1 = library.searchUSer(userName1);

                    if(user1 != null)
                        user1.returnBook();
                    else
                        System.out.println("You need to register at the library.");
                    break;

                case 3:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Choose an existing option.");
            }
        }
    }
}
