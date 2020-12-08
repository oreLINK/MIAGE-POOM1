package fr.miage.poo.m1;

import fr.miage.poo.m1.td1.*;
import fr.miage.poo.m1.td6.*;

public class Main {

    /**
     * TD1 La bonne formation des objets - encapsulation
     */
    private static void td1(){
        //creation du client
        Customer cus1 = new Customer("DUPONT","Michel",
                "Rue des lilas","dupont.michel@gmail.com","0654667892");
        //creation du catalogue
        Catalog catalog1 = new Catalog();
        //creation des 3 produits
        Product pro1 = new Product(1,"Ananas",7.5,45);
        Product pro2 = new Product(2,"Banane",3,140);
        Product pro3 = new Product(3,"Melon",5,15);
        //ajout des 3 produits au catalogue
        catalog1.addProduct(pro1);
        catalog1.addProduct(pro2);
        catalog1.addProduct(pro3);
        catalog1.display();
        //creation du panier
        Basket basket1 = new Basket();
        basket1
    }

    /**
     * TD6 Tourniquet du métro parisien
     * Les exceptions ont été gérées dans la méthode "action" dans la classe "Tourniquet"
     */
    private static void td6() {
        System.out.println("-- QUESTION 1 --");
        Tourniquet tourniquet1 = new Tourniquet();
        tourniquet1.action(Actions.INSERER_BON_TICKET);
        tourniquet1.action(Actions.PRENDRE_TICKET);
        tourniquet1.action(Actions.AVANCER);
        System.out.println("\n"+"-- QUESTION 2 --");
        Tourniquet tourniquet2 = new Tourniquet();
        tourniquet2.action(Actions.PANNE);
        tourniquet2.action(Actions.REPARATION);
        tourniquet2.action(Actions.MISE_EN_MAINTENANCE);
        tourniquet2.action(Actions.REPRISE_SERVICE);
    }

    public static void main(String[] args) {
        td1();
	    //td6();
    }
}
