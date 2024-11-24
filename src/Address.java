import java.util.Objects;

public class Address {
    protected final String country;
    protected final String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        boolean isCountryEqual = country.equalsIgnoreCase(address.country);
        boolean isCityEqual = city.equalsIgnoreCase(address.city);
        return isCountryEqual && isCityEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country.toLowerCase(), city.toLowerCase());
    }
}
