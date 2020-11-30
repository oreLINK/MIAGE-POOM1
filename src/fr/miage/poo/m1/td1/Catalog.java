package fr.miage.poo.m1.td1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Product> produitsEnStock = new ArrayList<Product>();

    public Catalog() {
    }

    public void addProductToCatalog(Product product){
        produitsEnStock.add(product);
    }

}
