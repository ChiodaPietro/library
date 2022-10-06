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

    public Book[] getScience() {
        return science;
    }

    public Book[] getScience_fiction() {
        return science_fiction;
    }

    public Book[] getRomance() {
        return romance;
    }

    public int getBook_position( Book book) {
        switch (book.getBook_type()) {
            case "fantasy":
                for (int i = 0; i < fantasy.length; i++) {
                    if(fantasy[i]!=null){
                        System.out.println("fantasy");
                        return i;
                    }
                }
            case "thriller":
                for (int i = 0; i < thriller.length; i++) {
                    if(thriller[i]!=null){
                        System.out.println("thriller");
                        return i;
                    }
                }
            case "romance":
                for (int i = 0; i < romance.length; i++) {
                    if(romance[i]!=null){
                        System.out.println("romance");
                        return i;
                    }
                }
            case "yellow":
                for (int i = 0; i < yellow.length; i++) {
                    if(yellow[i]!=null){
                        System.out.println("yellow");
                        return i;
                    }
                }
            case "science":
                for (int i = 0; i < science.length; i++) {
                    if(science[i]!=null){
                        System.out.println("science");
                        return i;
                    }
                }
            case "science fiction":
                for (int i = 0; i < science_fiction.length; i++) {
                    if(science_fiction[i]!=null){
                        System.out.println("science ficiotn");
                        return i;
                    }
                }
        }
        return -1;
    }

    public boolean add_book(Book book) {
        if ("fantasy thriller yellow romance science science fiction".toLowerCase().indexOf(book.getBook_type().toLowerCase()) >= 0) {
            String type = book.getBook_type().toLowerCase();
            for (int i = 0; i < fantasy.length; i++) {
                switch (type) {
                    case "fantasy":
                        if (fantasy[i] == null) {
                            fantasy[i] = book;
                            i = fantasy.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "thriller":
                        if (thriller[i] == null) {
                            thriller[i] = book;
                            i = thriller.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "yellow":
                        if (yellow[i] == null) {
                            yellow[i] = book;
                            i = yellow.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "romance":
                        if(romance[i]==null){
                            romance[i]=book;
                            i= romance.length;
                            return true;
                        }else {
                            if(i==9){
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "science":
                        if(science[i]==null){
                            science[i]=book;
                            i= science.length;
                            return true;
                        }else {
                            if(i==9){
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "science fiction":
                        if(science_fiction[i]==null){
                            science_fiction [i]=book;
                            i= science_fiction.length;
                            return true;
                        }else {
                            if(i==9){
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                }
            }
        }
            return false;
        }
    }
