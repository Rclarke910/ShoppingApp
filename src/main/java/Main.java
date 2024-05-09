public class Main {

    public static void main(String[] args){

        User user1 = new User(1);
        Fries fries = new Fries(1,2,"French Fries", Sizes.L,3.99,1);
        Soda soda = new Soda(1,2,"Coke",Sizes.L,2.99,1);

        user1.addToCart(fries);
        user1.addToCart(soda);

        user1.viewCart();
        user1.cartQty();
        user1.totalAfterTax();
        user1.checkout();

    }

}
