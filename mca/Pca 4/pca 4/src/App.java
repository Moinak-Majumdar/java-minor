import java.util.ArrayList;

interface Readable {
    public boolean isReadable(int storage);
}

class Book implements Readable {

    public boolean isReadable(int storage) {
        return false; //returning false  because it is a book, and ist is nor directly available to read.
    }

    private String name, author;
    private int year;

    public Book(String n, String auth, int y) {
        name = n;
        author = auth;
        year = y;
    }

    public String getBookInfo() {
        return "\nTitle : " + name + ", Author : " + author + ", Year : " + year;
    }
}

class EBook extends Book implements Readable {
    private int size;
    private boolean status;

    public EBook(String n, String auth, int y, int si) {
        super(n, auth, y);
        size = si;
    }

    public boolean isReadable(int storage) {
        status = (size <= storage) ? true : false;
        return status;
    }

    public String getFileSize() {
        return "Size (MB) : " + size;
    }
}

class Catalogue {
    private ArrayList<Book> books;

    public Catalogue() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book b) { books.add(b); }

    public void addEbook(EBook e) { books.add(e); }

    public void removeBook(Book b) { books.remove( b);}

    public void removeEbook(EBook e) { books.remove( e);}

    // func to search book by its title
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book b : books) {
            if (b.getBookInfo().contains(title)) {
                results.add(b);
            }
        }
        return results;
    }
    // print all books
    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b.getBookInfo());
            if (b instanceof EBook) {
                EBook e = (EBook) b;
                System.out.println(e.getFileSize());
            }
        }
    }
    // print all readable books
    public void printAllReadables(int availableSpace) {
        for (Book b : books) {
            if (b.isReadable(availableSpace)) {
                System.out.println(b.getBookInfo());
                if (b instanceof EBook) {
                    EBook e = (EBook) b;
                    System.out.println(e.getFileSize());
                }
            }
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book("Book1", "auth 1", 1997);
        System.out.println(book1.getBookInfo());

        EBook ebook1 = new EBook("EBook1", "auth 2", 1998, 50);
        System.out.println(ebook1.getBookInfo());
        System.out.println("Ebook1 " + ebook1.getFileSize());

        System.out.println("\nImprovements 1\n");

        String msg1Book = (book1.isReadable(10) == true) ? "Book1 is available to read."
                : "Book1 is not available to read.";
        System.out.println(msg1Book);
        String msg1Ebook1 = (ebook1.isReadable(100)) ? "EBook1 is available to read."
                : "EBook 1 is not available to read.";
        System.out.println(msg1Ebook1);

        // change status depend on size
        System.out.println("\nEBook1 read status changing depending on available storage.");
        String msg2Ebook1 = (ebook1.isReadable(20)) ? "EBook1 is available to read."
                : "EBook 1 is not available to read.";
        System.out.println(msg2Ebook1);

        System.out.println("\nImprovements 2");

        Catalogue c  = new Catalogue();
        // adding books 
        c.addBook(new Book("Book2", "auth2", 1320));
        c.addBook(new Book("Book3", "auth3", 1580));
        // adding ebook
        c.addBook(new EBook("eBook4", "auth4", 1180, 50));
        c.addBook(new EBook("eBook5", "auth5", 1280, 70));

        System.out.println("\nAll books or ebooks in catalogue :");
        c.printAllBooks();

        System.out.println("\nAll ebooks that are readable with 60mb storage");
        c.printAllReadables(60);

        System.out.println("\nSearching books or ebooks by its title");
        ArrayList<Book> res = c.searchByTitle("Book3");
        for (Book b : res) {
            System.out.println(b.getBookInfo());
        }
        System.out.print("\nEnd");
    }
}
