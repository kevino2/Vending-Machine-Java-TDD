package drawer;

import coin.CoinType;
import product.Product;

import java.util.ArrayList;

public class Drawer {

    private DrawerCode code;
    private int price;
    private ArrayList<Product> products;

    public Drawer (DrawerCode code, int price) {
        this.code = code;
        this.price = price;
        this.products = new ArrayList <Product> ();
    }



    public DrawerCode   getDrawerCode() {
        return code;
    }

    public void setCode (DrawerCode code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public int countProducts() {
        return this.products.size();
    }

    public Product returnProduct() {
        if (this.products.size() > 0) {
            return this.products.remove(0);
        }
        return null;
    }

//    Create a Drawer class with a Enum code (A1, B1, ETC), price and a list of Products. (One product type per drawer
//    but could swap out for any other product)
//    Add methods to add a product to drawer and return product from drawer.

}
