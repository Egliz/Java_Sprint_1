public class Main {

    public static void main(String[] args) throws EmptySaleException {

        Sale sale1 = new Sale();
        Product product1 = new Product("PC", 7);

        sale1.addProduct(product1);
        sale1.calculateTotal();
        System.out.println(sale1.calculateTotal());
    }
}
