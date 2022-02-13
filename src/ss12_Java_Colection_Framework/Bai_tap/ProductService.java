package ss12_Java_Colection_Framework.Bai_tap;

import java.util.ArrayList;

public class ProductService {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product("rau", 1, 10));
        products.add(new Product("thit", 2, 5));
        products.add(new Product("ca", 3, 8));
    }

    void add(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public void update(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }

    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;

            }
        }
    }


    public Product search(String name) {
        for (Product product : products) {
            if (name.equals(product.getName()))
                return product;
        }
        return null;
    }
}
