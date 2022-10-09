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
                    "show the list of books: output");
            String choice=sc.next();
            switch (choice){
                case"add":
                    Book newbook;
                    System.out.println("enter the title, the pages number and the book_genre");
                    newbook= new Book("", 0, "");
                    System.out.println("enter the title");
                    newbook.setTitle(sc.next());
                    System.out.println("enter the pages number");
                    newbook.setPages_number(sc.nextInt());
                    System.out.println("enter the book type");
                    newbook.setBook_type(sc.next());
                    book_types.add_book(newbook);
                    break;
                case "search":
                    System.out.println("write the books name");
                    int position=book_types.getBook_position(sc.next());
                    System.out.println("books position: "+position);
                    break;
                case "output":
                    book_types.book_list_output(book_types.switch_genders());
                case "remove":
                    System.out.println("write the books name");
                    if(book_types.remove(sc.next())){
                        System.out.println("removed it succefully!");
                    }

            }
//            Book newbook = new Book("weird stuff", 1200, "romance");// create a list of objects, book[]> what kind of class variables do you want?
//            System.out.println(book_types.add_book(newbook));
//            System.out.println(book_types.getBook_position("zio"));
        }
    }
}
