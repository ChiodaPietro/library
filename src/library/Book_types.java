package library;

public class Book_types {
    private Book[] fantasy;

    private Book[] thriller;
    private Book[] yellow;
    private Book[] science_fiction;
    private Book[] romance;
    private Book[] science;

    public Book_types(int book_type_1, int book_type_2, int book_type_3, int book_type_4, int book_type_5, int book_type_6) {
        this.fantasy = new Book[book_type_1];
        this.thriller = new Book[book_type_2];
        this.yellow = new Book[book_type_3];
        this.science_fiction = new Book[book_type_4];
        this.romance = new Book[book_type_5];
        this.science = new Book[book_type_6];

    }

    public Book[] getFantasy() {
        return fantasy;
    }

    public Book[] getThriller() {
        return thriller;
    }

    public Book[] getYellow() {
        return yellow;
    }

    public Book[] getScience_fiction() {
        return science_fiction;
    }

    public Book[] getRomance() {
        return romance;
    }

    public Book[] getScience() {
        return science;
    }

    public boolean add_book(String title, int pages_number, String book_type) {
        boolean found= false;
        while(!found){

        }
        Book book= new Book(title,pages_number, book_type);
        return false;
    }
}
