package fr.miage.poo.m1.td1;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    Catalog catalog;
    Customer customer;
    private List<Product> panierClient = new ArrayList<Product>();

    public Basket(){}

    public void addProduct(Product product, int quantite){
        Product newProduct = new Product()
        panierClient.add(product);
    }

}
