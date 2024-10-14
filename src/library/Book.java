package library;

public class Book {
    String title;
    short releaseYear;
    Author author;
    int pages;

    public Book(String title, short releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        String lowerCasedWord = word.toLowerCase();
        return title.toLowerCase().contains(lowerCasedWord) || author.matches(lowerCasedWord);
    }

    public int estimatePrice() {
        int price = 3 * pages * (int)Math.floor(Math.sqrt(author.rating));
        return price < 250 ? 250 : price;
    }
}
