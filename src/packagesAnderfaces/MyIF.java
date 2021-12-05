package packagesAnderfaces;

public interface MyIF {

    int getNunber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefoltNumber() {
        return 123;

    }

}
