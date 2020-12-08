package fr.miage.poo.m1.td1;

public class Product {

    private int id;
    private String nom;
    private double prix;
    private int quantite;

    public Product(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public void display(){
        System.out.println("["+id+"] "+nom+" "+prix+"€ x"+quantite);
    }
}
