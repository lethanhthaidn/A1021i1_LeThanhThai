package ss12_Java_Colection_Framework.Bai_tap;

import java.io.*;
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
        fileWriter();
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

    public void fileWriter() {

        File file = new File("product.csv");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            for (int i = 0; i < products.size(); i++) {
                bufferedWriter.write(products.get(i).toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

//        try (FileWriter fileWriter = new FileWriter(file, true);){
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            String tmp= product.toString();
//            bufferedWriter.write(tmp);
////            fileWriter.write(tmp);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
