package fr.miage.poo.m1.td1;

public class Customer {

    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String numeroTelephone;
    private Basket panier;

    public Customer(String nom, String prenom, String adresse, String email, String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
    }

    public void addBasket(Basket panier){
        this.panier = panier;
    }

}
