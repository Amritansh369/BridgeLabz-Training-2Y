class Book {
    private static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    public String getIsbn() {
        return isbn;
    }
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("-------------------------");
        } else {
            System.out.println("Not a valid Book object!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Programming", "James Gosling", "ISBN1001");
        Book b2 = new Book("Data Structures", "Robert Lafore", "ISBN1002");
        b1.displayDetails();
        b2.displayDetails();
        System.out.println("Book 1 ISBN: " + b1.getIsbn());
    }
}

