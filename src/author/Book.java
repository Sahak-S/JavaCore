package author;

public class Book {

    private String title;
    private String description;
    private String price;
    private int count;

    public Book(String title, String description, String price, int count) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public Book(String title, String description, double price, int count) {
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                '}';
    }


}
