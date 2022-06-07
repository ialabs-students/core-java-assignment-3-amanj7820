package assignment_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    private int productCode;
    private String name;
    private double price;
    private String category;
    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static ArrayList<Product> getProductsList() {
        ArrayList<Product> prods = new ArrayList<>();
        Product f1 = new Product(101, "Trousers", 700.00, "fashion");
        Product f2 = new Product(102, "Jeans", 1000.00, "fashion");
        Product f3 = new Product(103, "shirt", 500.00, "fashion");
        Product m1 = new Product(104, "Macbook", 100000.00, "mobile");
        Product m2 = new Product(105, "Ipad", 30000.00, "mobile");
        Product m3 = new Product(106, "samsung", 15000.00, "mobile");
        Product e1 = new Product(107, "TVs", 52000.00, "appliances");
        Product e2 = new Product(108, "Fridge", 250000.00, "appliances");
        Product e3 = new Product(109, "Coolers", 25000.00, "appliances");
        prods.add(f1);
        prods.add(f2);
        prods.add(f3);
        prods.add(m1);
        prods.add(m2);
        prods.add(m3);
        prods.add(e1);
        prods.add(e2);
        prods.add(e3);
        return prods;
    }

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        String prodName = productService.findNameByCode(513);
        System.out.println(prodName);

        Product product_obj = productService.findMaxPriceProduct("mobile");
        System.out.println(product_obj);

        ArrayList<Product> products = productService.getProductsByCategory("fashion");
        if (products != null) {
            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                Product product = (Product) itr.next();
                System.out.println("[ product code: " + product.getProductCode() + ", product name: "
                        + product.getName() + ", product price: Rs." + product.getPrice() + ", product catagory: "
                        + product.getCategory() + " ]");
            }
        }
    }
}