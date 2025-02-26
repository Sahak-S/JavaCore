package javadas.generics.collectionsFramework;

import java.util.Objects;

public class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {

        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(name, address.name) && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(code, address.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, street, city, state, code);
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
