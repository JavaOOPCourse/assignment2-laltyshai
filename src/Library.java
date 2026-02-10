public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if ( count <books.length) {
            books[count]=book;
            count++;
        }
    }

    public void displayBooks() {
        for (Book i : books)
            if (i!=null) {
                System.out.println(i);
            }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
            for (Book i : books) {
                if (i.getTitle().equals(title)) return i;
            }
            return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        for (Book i : books) {
            if (i.getTitle()==title)
                i.setAvailable(false);
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        for (Book i : books) {
            if (i.getTitle()==title)
            i.setAvailable(true);
        }
    }
}
