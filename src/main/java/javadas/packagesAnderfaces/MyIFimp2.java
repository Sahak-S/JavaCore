package javadas.packagesAnderfaces;

public class MyIFimp2 implements MyIF{

    @Override
    public int getNunber() {
        return 1000;
    }

    @Override
    public String getString() {
        return "Это другая символьная строка";
    }


}
