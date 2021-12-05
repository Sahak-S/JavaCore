package packagesAnderfaces;

public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIFimp obj = new MyIFimp();
        MyIFimp2 obj1 = new MyIFimp2();
        int deNum = MyIF.getDefoltNumber();
        System.out.println(obj.getNunber());
        System.out.println(obj.getString());
        System.out.println(obj1.getNunber());
        System.out.println(obj1.getString());
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());



        System.out.println(obj.getNunber()==obj1.getNunber());

        if (obj.hashCode() == obj1.hashCode()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if (obj.getString().equals(obj1.getString())){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println(obj.getClass());
        System.out.println(obj1.getClass());
        System.out.println(obj.toString());
    }
}
