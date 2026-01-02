// Store products in ecommerce

package Week2tsk4;

import java.util.HashMap;

public class ECommerceProducts {
    public static void main(String[] args) {
        HashMap<Integer, String> products = new HashMap<>();

        products.put(201, "Laptop");
        products.put(202, "Smartphone");
        products.put(203, "Tablet");
        products.put(204, "Headphones");
        products.put(205, "Smartwatch");

        System.out.println("\nE-commerce Product List:");

        for (java.util.Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        }
    }
}

