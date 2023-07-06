package packagesAnderfaces.Interfaces;

public class IFTest3 {
    public static void main(String[] args) {

        IntStack mystack;
        IntStack1 mystack1;
//создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;

        // загрузить динамический стек
//разместить числа в стеке
        for(int i=0; i<12; i++){
            mystack.push(i);
        }
        mystack = fs;                              // загрузить фиксированный стек
        for(int i=0; i<8; i++){
            mystack.push(i);
        }
        mystack = ds;
        System.out.println("Знaчeния в динамическом стеке:");
        for(int i=0; i<12; i++)
            System.out.println(mystack.рор());
        mystack = fs;
        System.out.println("Знaчeния в фиксированном стеке:");
        for(int i=0; i<8; i++)
            System.out.println(mystack.рор());
        System.out.println(ds.clear());
    }

}
