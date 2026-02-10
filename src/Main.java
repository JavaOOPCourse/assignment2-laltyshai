import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("иська");
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("enter title");
                    String title =scanner.nextLine();
                    System.out.println("enter author");
                    String author =scanner.nextLine();

                    System.out.println("enter year");
                    int year =scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Book a=new Book(title, author, year);
                    library.addBook(a);
                    break;

                case 2:
                    System.out.println("enter title");
                    String title2 =scanner.nextLine();
                    System.out.println("enter author");
                    String author2 =scanner.nextLine();
                    System.out.println("enter year");
                    int year2 =scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("enter file size");
                    double size =scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    Book b=new EBook(title2, author2, year2, size);
                    library.addBook(b);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("enter title to search");
                    String title3 =scanner.nextLine();
                    library.searchByTitle(title3);
                    break;

                case 5:
                    System.out.println("enter title to borrow");
                    String title5 =scanner.nextLine();
                    library.borrowBook(title5);
                    break;

                case 6:
                    System.out.println("enter title to return");
                    String title6 =scanner.nextLine();
                    library.returnBook(title6);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
