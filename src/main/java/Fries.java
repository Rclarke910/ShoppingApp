public class Fries extends Food implements Perishable {

    public Fries(int id, int sharedID, String name, Sizes size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
    }
}
