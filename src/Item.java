public class Item {
    private int itemCode;
    private String Name;
    Item(int i, String n){
        itemCode = i;
        Name = n;
    }
    public void display(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Name: " + Name);
    }

}
