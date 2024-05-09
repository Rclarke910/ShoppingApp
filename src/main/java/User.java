import java.util.ArrayList;
import java.util.List;
public class User {

    private int id;

    private Cart cart;

    public User(int id){
        this.id = id;
        this.cart = new Cart();
    }

    public static void addToCart(Product product, int qty){
    }

    public void addToCart(Product product) {
        cart.addToCart(product);
    }

    public void removeFromCart(Product product){
        cart.removeFromCart(product);
    }

    public void viewCart(){
        cart.printCart();
    }

    public void cartQty(){
        cart.cartQty();
    }

    public void subTotal(){
        System.out.println(cart.subTotal());
    }

    public void totalAfterTax(){
        cart.totalAfterTax();
    }

    public void checkout(){
        cart.checkout();
    }
}
