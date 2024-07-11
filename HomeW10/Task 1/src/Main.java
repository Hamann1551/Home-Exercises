import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double praceBook = inputPraceBook();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, praceBook);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.print("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.print("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPraceBook() {
        System.out.print("Введите цену книги в грн: ");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        //booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.\n";
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double praceBook){
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр., " + "-> " + "цена: " + (praceBook > 0 ? praceBook : "N/A") + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }



}
