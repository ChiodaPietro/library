package library;


import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library("name", "address", 222222222);
        Book_types book_types = new Book_types(10,10,10,10,10,10);
        // we want titles, and stuff, so we choose the class book.
        //create a new boook
        while(true) {
            System.out.println("add a new book;\n" +
                    "remove a book\n" +
                    "search a book\n" +
                    "exit the library");
            String choice=sc.next();
            switch (choice){
                case"add":
                    Book newbook;
                    System.out.println("enter the title, the pages number and the book_genre");
                    newbook= new Book(sc.next(), sc.nextInt(), sc.next());
                case "search":
                    book_types.getBook_position(newbook.getBook_type());
                    break;
                case "output":
                    book_types.book_list_output(book_types.switch_genders());
            }
            Book newbook = new Book("weird stuff", 1200, "romance");// create a list of objects, book[]> what kind of class variables do you want?
            System.out.println(book_types.add_book(newbook));
            System.out.println(book_types.getBook_position(newbook));
        }
    }
}
