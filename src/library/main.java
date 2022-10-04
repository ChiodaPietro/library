package library;

public class main {
    public static void main(String[] args) {
        Library library = new Library("name", "address", 222222222);
        Book_types book_types = new Book_types(10,10,10,10,10,10);
        Book[] newbook = new Book[10];// create a list of objects, book[]> what kind of class variables do you want?
        // we want titles, and stuff, so we choose the class book.
        //create a new boook

        System.out.println(book_types.getFantasy());

//        for (int i = 0; i < newbook.length; i++) {
//            newbook[i] = (new Book("Lord of the Rings", 1200, "fantasy"));
//            System.out.println(newbook[i].getTitle());
//            if(newbook[i].getBook_type().equals("fantasy")){
//                System.out.println(newbook[i].getTitle()+": "+newbook[i].getBook_type());
//            }
//        }
    }
}
