package packagesAnderfaces.Interfaces;

public class DynStack implements  IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    public void push(int item) {
        if (tos == stck.length - 1) {              // использовать поле длины стека
            System.out.println("Cтeк заполнен.");
            int temp[] = new int[stck.length * 2];
            // удвоить размер стека
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int рор() {
        return 0;
    }

    public int pop () {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}
