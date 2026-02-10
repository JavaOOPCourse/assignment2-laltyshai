public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title=title;
        this.author=author;
        this.year=year;
        isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title=other.title;
        this.author=other.author;
        this.year=other.year;
        this.isAvailable = other.isAvailable;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        isAvailable=false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        isAvailable=true;

    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Ttile: "+title+", Author: "+author+", Year: "+year+", Available = "+isAvailable;
    }


    public boolean equals(Book obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return year == obj.year &&
                title.equals(obj.title) &&
                author.equals(obj.author);
    }
}

