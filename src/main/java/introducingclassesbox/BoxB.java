package introducingclassesbox;

public class BoxB {
    double width;
    double height;
    double depth;

    double valium(){
        return width * height * depth;
    }
    void  setDim(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}
