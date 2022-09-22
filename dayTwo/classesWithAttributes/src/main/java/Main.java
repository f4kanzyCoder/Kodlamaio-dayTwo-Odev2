public class Main {
    public static void main(String[] args) {
        //Constructor suz urun ekleme
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Apple Laptop");
        product.setPrice(15000);
        product.setStockAmount(3);
        //Constructor ile  urun ekleme
        Product product1 = new Product(2, "Phone", "I Phone 12", 10000, 4, "Black");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        System.out.println(product.getCode());
        System.out.println(product1.getCode());
    }
}
