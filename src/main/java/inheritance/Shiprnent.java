package inheritance;

public class Shiprnent extends BoxWeightBox {

    double cost;

    Shiprnent(Shiprnent ob) {
        super(ob);
        cost = ob.cost;
    }

    Shiprnent(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shiprnent() {
        super();
        cost = -1;
    }

    Shiprnent(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
