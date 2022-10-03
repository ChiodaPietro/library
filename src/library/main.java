package library;

public class main {
    public static void main(String[] args) {
        Library library= new Library("name", "address", 222222222);
        book_types book_types= new book_types("thriller","yellow","fantasy", "science fiction", "romance", "science" );
        book_types[] list= new book_types[6];
        for(int i = 0 ; i < list.length; i++){
            System.out.println(list[4]);
        }
    }
}
