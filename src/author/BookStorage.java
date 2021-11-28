package author;

public class BookStorage {

    private final Book[] books = new Book[16];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();

        }
        books[size++] = book;

    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        System.arraycopy(books, 0, temp, 0, books.length);
        temp = books;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(books[i] + " ");
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }

        }

    }

    public void searchByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            } else {
                System.out.println("invalid email");
            }

        }
    }

    public void countByAuthor(String emile) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(emile)) {
                count++;
            }
        }
        System.out.println("Author with this email has " + count + " writhed books");
    }



    public Book getTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;

    }

    public void deleteBook(String title) {

        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                deleteBook(title);
                System.out.println("The book has been deleted");
                System.out.println("Գիրքը ջնջվել է");

            }

        }
    }
    private void deleteByIndex(int index) {
        for (int j = index + 1; j < size; j++) {
            books[j - 1] = books[j];
        }
        size--;
    }

    public Book getByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)){
                return books[i];
            }
        }
        return null;
    }

    public void deleteBookofAuthors(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)){

                deleteByIndex(i);
            }

        }
    }


//    public void deleteBook(String title) {
//        for (int i = 0; i < size; i++) {
//            if (books[i].getTitle().equals(title)) {
//                deleteByIndex(i);
//                System.out.println("The book has been deleted");
//            }
//        }
//    }
//
//    private void deleteByIndex(int index) {
//        for (int j = index + 1; j < size; j++) {
//            books[j - 1] = books[j];
//            for (int i = 0; i < size; i++) {
//                for (int j = index + 1; j < size; j++) {
//                    books[j - 1] = books[j];
//                }
//                size--;
//            }
}