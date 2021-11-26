package author;

public class AuthorStorage {

    private Author[] authors = new Author[16];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();

        }
        authors[size++] = author;

    }

    private void extend() {
        Author[] temp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, temp, 0, authors.length);
        authors = temp;
    }

    //Եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է
    // վերադարձնել մասիվի index-երրորդ էլեմենտները,հակառակ դեպքում վերադարձնել -1:

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(authors[i] + " ");
        }
    }

    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) || authors[i].getSurnname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }

    }


    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge && authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {

        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public Author getByEmail() {
        for (int i = 0; i < size; i++) {
            return authors[i];
        }
        return null;
    }


    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurnname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }

    }
    public void deleteByAuthor(String email) {
        for (int i = 0; i <size; i++) {
            if (authors[i].getEmail().equals(email)){
                deleteByAuthor(email);
                System.out.println("The author has been deleted");
                System.out.println("Հեղինակը ջնջվել է");

            }

        }

    }

    public void deleteByAuthor() {


    }
}


