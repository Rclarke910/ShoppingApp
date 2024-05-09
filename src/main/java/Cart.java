import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    private float tax = 2.0f;

    public Cart(){
        this.products = new ArrayList<>();
    }

    public void addToCart(Product product){
        products.add(product);
    }

    public void removeFromCart(Product product){
        products.remove(product);
    }

    public void printCart(){
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

    public void cartQty(){
        System.out.println(products.size());
    }

    public double subTotal(){
        double total = 0;
        for(Product product : products){
            total+= product.getPrice();
        }
        return total;
    }

    public double totalAfterTax(){
        double sub = subTotal();

        return sub + tax;
    }

    public void checkout(){

        List<String> ex = new ArrayList<>();

        for(Product prod : products){
            ex.add(prod.getName());
        }

        System.out.println("you purchased " + ex + " for a total of " + totalAfterTax());
    }


}
