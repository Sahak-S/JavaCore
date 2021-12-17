package enumerationsEnum;

public enum Apple1 {

    JONATHAN(10), GOLDENDEL(12), REDDEL(8), WINESAP(14), CORTLAND(7);

    private int price;   // цена яблока каждого сорта

    Apple1(int p) {
        price = p;
    }
    Apple1() {
        price = -1;
    }


    public int getPrice() {
        return price;
    }
}
