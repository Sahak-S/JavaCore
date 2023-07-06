package packagesAnderfaces.Interfaces;

 public class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    public void push(int item) {
        if (tos == stck.length - 1) {              // использовать поле длины стека
            System.out.println("Cтeк заполнен.");
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