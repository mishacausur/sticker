package library;

public class Book {
    String title;
    short releaseYear;
    String author;
    int pages;

    public Book(String title, short releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        String lowerCaedWord = word.toLowerCase();
        return title.toLowerCase().contains(lowerCaedWord) || author.toLowerCase().contains(lowerCaedWord);
    }

    public int estimatePrice() {
        int price = 3 * pages;
        return price < 250 ? 250 : price;
    }
}
