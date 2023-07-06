package packagesAnderfaces.Interfaces;

public interface IntStack3 {

    void push(int item); // сохранить элемент в стеке

    int pop();           //извлечь элемент из стека

    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    default int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}

