package introducingclassesbox;

public class BoxKonstruktor {

    double width;
    double height;
    double depth;
    BoxKonstruktor(){
        System.out.println("BoxKonstruktor");
        width =10;
        height = 10;
        depth = 10;
    }

    double valium() {
        return width * height * depth;
    }
}
