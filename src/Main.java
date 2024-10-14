import library.Book;

public class Main {

    public static void main(String[] args) {
        Book it = new Book("It", (short) 2024, "Stephen King", 723);
        System.out.println("Is this book big? " + it.isBig());
        System.out.println("Does this book name contains \"It\" " + it.matches("it"));
        System.out.println("How much does this book cost? " + it.estimatePrice() + " rub");
    }
}