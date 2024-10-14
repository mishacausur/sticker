import library.*;

public class Main {

    public static void main(String[] args) {
        Author stephen = new Author("Stephen", "King", 8);
        Book it = new Book("It", (short) 2024, stephen, 723);
        System.out.println("Is this book big? " + it.isBig());
        System.out.println("Does this book name contains \"It\" " + it.matches("it"));
        System.out.println("Does this book name contains \"king\" " + it.matches("king"));
        System.out.println("How much does this book cost? " + it.estimatePrice() + " rub");
    }
}