package library;

public class Book {
    private String title, book_type;
    private int pages_number;
    public Book(String title, int pages_number, String book_type){
        this.title=title;
        this.pages_number=pages_number;
        this.book_type=book_type;
    }
    public String getTitle(){
        return this.title;
    }
    public String getBook_type(){
        return this.book_type;
    }
    public int getPages_number(){
        return this.pages_number;
    }
    public void  setTitle(String title){this.title=title;}
    public void setBook_type(String book_type){this.book_type=book_type;}
    public void setPages_number(int pages_number){this.pages_number=pages_number;
    }
}
