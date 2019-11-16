public class Clothing extends Item implements Discount, Tax {
    private String brand;
    private double price;
    private double units;
    private double discount;
    private final double taxp = 8.5;
    Clothing(int i, String n, double p, double u, String b, double d){
        super(i, n);
        brand = b;
        price = p;
        units = u;
        discount = d;
    }
    public double computeDiscount(){
        double discountamount = (units * price) * (discount/100);
        return discountamount;
    }
    public double computeTax(){
        double taxamount = (units * price * taxp) / 100;
        return taxamount;
    }
    public double computeTotalPrice(){
        double finalprice = (price * units) + computeTax() - computeDiscount();
        return finalprice;
    }
    public void displayClothing(){
        display();
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Units: " + units);
        System.out.println("Discount: " + computeDiscount() + "%");
        System.out.println("Tax amount: " + computeTax());
        System.out.println("Final price: $" + computeTotalPrice());
    }
}
