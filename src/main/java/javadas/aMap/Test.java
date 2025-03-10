package javadas.aMap;

public class Test {

    public static void main(String[] args) {
        CashPayment c = new CashPayment(100.00);
        CashPayment p = new CashPayment(200.00);

        CreditCardPayment cc= new CreditCardPayment(1000.00, "name1", "04/27", "123456789");
        CreditCardPayment cp= new CreditCardPayment(2000.00, "name2", "03/27", "987654321");

        c.paymentDetails();
        cc.paymentDetails();
        p.paymentDetails();
        cp.paymentDetails();

    }
}

class Payment{
    double amount;

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount= amount;
    }

    Payment(double val){
        this.amount=Math.round(val * 100)/100.0;
    }
    public void paymentDetails() {
        System.out.println("Վճարման գումարն է= "+this.amount);
    }
}
class CashPayment extends Payment{
    CashPayment(double val){
        super(val);
    }
    public void paymentDetails() {
        System.out.println("Վճարման գումարն է="+this.amount);
    }
}
class CreditCardPayment extends Payment{
    String CardName, ExpirationDate,CreditCardNumber;

    CreditCardPayment(double Value, String CardName, String ExpirationDate, String CreditCardNumber){
        super(Value);
        this.CardName=CardName;
        this.ExpirationDate=ExpirationDate;
        this.CreditCardNumber= CreditCardNumber;
    }
    public void paymentDetails() {
        System.out.println("Գումարի վճարում "+this.amount + "քարտով "+this.CreditCardNumber+ " պիտանելիության ժամկետի հետ "+this.ExpirationDate+ " քարտատիրոջ կողմից "+ this.CardName );
    }
}