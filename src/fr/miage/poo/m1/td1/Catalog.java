package fr.miage.poo.m1.td1;

public class Catalog {

    private int tailleTableaux = 10;
    private Product[] produitsEnStock = new Product[tailleTableaux];
    private int[] qteProduitsEnStock = new int[tailleTableaux];

    public Catalog() {
    }

    public int getTailleTableaux() {
        return tailleTableaux;
    }

    public void addProductToCatalog(Product product, int quantité) {
        
    }

}
