package author;

public class Book {
    private String title;
    private String description;
    private String price;
    private int count;
    private Author author;

    public Book(String title, String description, String price, int count, Author author) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.author = author;
    }

    public Book(String title, String description, double price, int count, Author author) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                ", author=" + author +
                '}';
    }

    public void setAuthor(String name, String surname, String gender, int age){

        name = author.getName();
        surname = author.getSurnname();
        gender = author.getGender();
        age = author.getAge();
    }
}
