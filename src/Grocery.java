public class Grocery extends Item implements Discount, Tax{
    private double price;
    private double units;
    private double discount;
    Grocery(int i, String n, double p, double u, double d){
        super(i, n);
        price = p;
        units = u;
        discount = d;
    }
    public double computeDiscount(){
        double discountamount = (units * price) * (discount/100);
        return discountamount;
    }
    public double computeTax(){
        double taxamount = (price * 0) / 100;
        return taxamount;

    }
    public double computeTotalPrice(){
        double finalprice = (price * units) + computeTax() - computeDiscount();
        return finalprice;
    }
    public void displayGrocery(){
        display();
        System.out.println("Price: $" + price);
        System.out.println("Units: " + units);
        System.out.println("Discount: " + computeDiscount());
        System.out.println("Tax amount: " + computeTax());
        System.out.println("Final price: $" + computeTotalPrice());
    }

}
