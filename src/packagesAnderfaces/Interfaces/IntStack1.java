package packagesAnderfaces.Interfaces;

public interface IntStack1 {

    void push(int item); // сохранить элемент в стеке
    int рор();           //извлечь элемент из стека

    default void clear(){
        System.out.println("Meтoд clear() не реализован");
    }
}
