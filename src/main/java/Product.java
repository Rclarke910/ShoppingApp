public abstract class Product {

     private int id;

     private int sharedID;

    public String getName() {
        return name;
    }

    private String name;

     private Sizes size;

    public double getPrice() {
        return price;
    }

    private double price;

     private int inventory;

     public Product(int id, int sharedID, String name, Sizes size, double price, int inventory){
         this.inventory = inventory;
         this.id = id;
         this.name = name;
         this.price = price;
         this.sharedID = sharedID;
         this.size = size;
     }
}
