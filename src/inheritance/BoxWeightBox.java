package inheritance;

public class BoxWeightBox extends BoxBox{

    double weight;

    BoxWeightBox(BoxWeightBox ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeightBox(double w,double h,double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeightBox(){
        super();
        weight = -1;
    }
    BoxWeightBox(double len,double m){
        super(len);
        weight = m;
    }


}
