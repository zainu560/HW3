public class demoDepartmentBilling {
    public static void main(String[] args){
        Grocery grocery1 = new Grocery(11, "Bread", 2.0, 1.5, 0);
        Grocery grocery2 = new Grocery(12, "Apple", 6.0, 0.75, 1);

        Clothing clothing1 = new Clothing(21, "Jeans", 35, 1.0, "Levi's", 0);
        Clothing clothing2 = new Clothing(22, "Dress Shirt", 25, 2.0, "Izod", 10);

        grocery1.displayGrocery();
        grocery2.displayGrocery();
        clothing1.displayClothing();
        clothing2.displayClothing();

        double grandtotal = grocery1.computeTotalPrice() + grocery2.computeTotalPrice() + clothing1.computeTotalPrice() + clothing2.computeTotalPrice();

        System.out.println("The final total: $" + grandtotal);
    }
}
