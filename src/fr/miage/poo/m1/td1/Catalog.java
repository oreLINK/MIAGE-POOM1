package fr.miage.poo.m1.td1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private int idProduit = 0;

    public int getIdProduit(){
        return idProduit;
    }
    public void incTd1_idProduit(){
        idProduit++;
    }

    private List<Product> produitsEnStock = new ArrayList<Product>();

    public Catalog() {
    }

    public void addProduct(Product product){
        produitsEnStock.add(product);
    }

    public void display(){
        System.out.println("-- Catalogue --");
        for(Product p : produitsEnStock){
            p.display();
        }
    }

}
