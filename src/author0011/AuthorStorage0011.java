package author0011;

public class AuthorStorage0011 {
    private Author0011[] array = new Author0011[10];
    //Սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է:
    private int size = 0;

    //Ստուգել, եթե մասիվի մեջ տեղ չկա -> ,կանչել extend()  և ավելացնել:
    public void add(Author0011 author0011) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author0011;

    }
    private void extend() {
        Author0011[] array1 = new Author0011[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public Author0011 getByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
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
