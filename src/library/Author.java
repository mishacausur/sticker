package library;

public class Author {
    String name;
    String surname;
    int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public boolean matches(String word) {
        return name.toLowerCase().contains(word) || surname.toLowerCase().contains(word);
    }
}
