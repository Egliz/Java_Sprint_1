
import java.util.ArrayList;

public class Sale {

    private double totalPrice;
    public ArrayList<Product> products;

    public Sale() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added.");
    }

    public double calculateTotal() throws EmptySaleException {
        int i = 0;
        totalPrice = 0;
        if (products.size() == 0)
            throw new EmptySaleException("To make a sale, you first have to add products.");
        else {
            while (i < products.size()) {
                totalPrice = products.get(i).getPrice() + totalPrice;
                i++;
            }
            return totalPrice;
        }
    }
}
