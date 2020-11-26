package fr.miage.poo.m1;

import fr.miage.poo.m1.td6.*;

public class Main {

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
	    td6();
    }
}
