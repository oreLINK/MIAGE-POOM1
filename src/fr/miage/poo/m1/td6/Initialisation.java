package fr.miage.poo.m1.td6;

public class Initialisation implements EtatTourniquet {

    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.INITIALISATION;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : Tourniquet en service. Veuillez insérer un ticket.");
    }
}
