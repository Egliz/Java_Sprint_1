public class Main {

    public static void main(String[] args) throws EmptySaleException {

        Sale sale1 = new Sale();
        Product product1 = new Product("PC", 7);
        Product product2 = new Product("Keyboard", 10);

        sale1.addProduct(product1);
        sale1.addProduct(product2);
        sale1.calculateTotal();
        System.out.println(sale1.calculateTotal());

        try {
            sale1.products.get(2);
        } catch (Exception IndexOutOfBoundsExceptionn ) {
            System.out.println("Exception in thread \"main\" java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2\n" +
                    "\tat java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)\n" +
                    "\tat java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)\n" +
                    "\tat java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)");
        }





    }
}
