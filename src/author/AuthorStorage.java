package author;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            extend();

        }
        array[size++] = author;

    }
    private void extend() {
        Author[] array1 = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    //Եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է
    // վերադարձնել մասիվի index-երրորդ էլեմենտները,հակառակ դեպքում վերադարձնել -1:
    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return array[index];

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
