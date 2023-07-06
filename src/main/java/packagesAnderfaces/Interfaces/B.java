package packagesAnderfaces.Interfaces;

public class B implements A.NestedIF {

    public boolean isNotNegative(int х) {
        return х <  0 ? false : true;
    }
}