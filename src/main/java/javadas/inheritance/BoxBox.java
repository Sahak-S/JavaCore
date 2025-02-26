package javadas.inheritance;

public class BoxBox {

    private double width;
    private double height;
    private double depth;

    BoxBox(BoxBox ob){

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxBox(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }

    BoxBox(){
        width = -1;
        height = -1;
        depth = -1;
    }
    BoxBox(double len){
        width = height = depth = len;
    }
    double voliume(){

        return width * height * depth;
    }
}
