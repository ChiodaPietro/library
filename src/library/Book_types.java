package library;

import java.util.Scanner;

public class Book_types {
    static Scanner sc = new Scanner(System.in);
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

    /*
    i can't find the book, because i can't use a string variable or an object
    what to do now???? we need to return the position and type of that book just
    from the title
     */
    public int getBook_position(String title) {
        title = title.toLowerCase();
        for (int i = 0; i < fantasy.length; i++) {
            if (fantasy[i] != null) {
                if (fantasy[i].getTitle().equals(title)) {
                    System.out.println("fantasy");
                    return i;
                }
            }
        }

        for (int i = 0; i < thriller.length; i++) {
            if (fantasy[i] != null) {
                if (thriller[i].getTitle().equals(title)) {
                    System.out.println("thriller");
                    return i;
                }
            }
        }
        for (int i = 0; i < romance.length; i++) {
            if (fantasy[i] != null) {

                if (romance[i].getTitle().equals(title)) {
                    System.out.println("romance");
                    return i;
                }
            }
        }

        for (int i = 0; i < yellow.length; i++) {
            if (fantasy[i] != null) {

                if (yellow[i].getTitle().equals(title)) {
                    System.out.println("yellow");
                    return i;
                }
            }
        }

        for (int i = 0; i < science.length; i++) {
            if (fantasy[i] != null) {

                if (science[i].getTitle().equals(title)) {
                    System.out.println("science");
                    return i;
                }
            }
        }

        for (int i = 0; i < science_fiction.length; i++) {
            if (fantasy[i] != null) {

                if (science_fiction[i].getTitle().equals(title)) {
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
                        if (romance[i] == null) {
                            romance[i] = book;
                            i = romance.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "science":
                        if (science[i] == null) {
                            science[i] = book;
                            i = science.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                    case "science fiction":
                        if (science_fiction[i] == null) {
                            science_fiction[i] = book;
                            i = science_fiction.length;
                            return true;
                        } else {
                            if (i == 9) {
                                System.out.println("there is no space left on the fantasy bookshelf");
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    public void book_list_output(Book[] book_type) {
        for (int i = 0; i < fantasy.length; i++) {
            if(book_type[i]!=null) {
                System.out.print(book_type[i].getTitle());
                System.out.print(" -number of pages:"+book_type[i].getPages_number());
                System.out.println("");
            }
        }
        System.out.println("-And nothing else");
    }

    public Book[] switch_genders() {
        System.out.println("choose the book gender");
        switch (sc.next().toLowerCase()) {
            case "fantasy":
                return getFantasy();

            case "thriller":
                return getThriller();

            case "yellow":
                return getYellow();

            case "romance":
                return getRomance();

            case "science":
                return getScience();

            case "science fiction":
                return getScience_fiction();
            default:
                System.out.println("invalid input");

        }

        return null;
    }
    public boolean remove(String title) {
        title = title.toLowerCase();
        for (int i = 0; i < fantasy.length; i++) {
            if (fantasy[i] != null) {
                if (fantasy[i].getTitle().equals(title)) {
                    fantasy[i]=null;
                    return true;
                }
            }
        }

        for (int i = 0; i < thriller.length; i++) {
            if (fantasy[i] != null) {
                if (thriller[i].getTitle().equals(title)) {
                    thriller[i]=null;
                    return true ;
                }
            }
        }
        for (int i = 0; i < romance.length; i++) {
            if (fantasy[i] != null) {

                if (romance[i].getTitle().equals(title)) {
                    romance[i]=null;
                    return true;
                }
            }
        }

        for (int i = 0; i < yellow.length; i++) {
            if (fantasy[i] != null) {

                if (yellow[i].getTitle().equals(title)) {
                    yellow[i]=null;
                    return true ;
                }
            }
        }

        for (int i = 0; i < science.length; i++) {
            if (fantasy[i] != null) {

                if (science[i].getTitle().equals(title)) {
                    science[i]=null;
                    return true;
                }
            }
        }

        for (int i = 0; i < science_fiction.length; i++) {
            if (fantasy[i] != null) {

                if (science_fiction[i].getTitle().equals(title)) {
                    science_fiction[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
}

