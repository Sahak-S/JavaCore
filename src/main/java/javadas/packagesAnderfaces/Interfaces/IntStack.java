package javadas.packagesAnderfaces.Interfaces;

public interface IntStack {

    void push(int item); // сохранить элемент в стеке
    int рор();           //извлечь элемент из стека

    default String clear(){
        System.out.println("Meтoд clear() не реализован");
        return "Meтoд clear() не реализован";

    }
}
