package strategy;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(200, new NoDiscount());

        System.out.println("total (sem desconto): " + cart.total());
        cart.setDiscountStrategy(new PercentageDiscount(10));

        System.out.println("total (10%): " + cart.total());
        cart.setDiscountStrategy(new FixedDiscount(20));

        System.out.println("total (-20): " + cart.total());
    }
}
