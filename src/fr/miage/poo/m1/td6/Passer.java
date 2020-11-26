package fr.miage.poo.m1.td6;

import jdk.swing.interop.SwingInterOpUtils;

public class Passer implements EtatTourniquet {

    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.PASSER;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : Ticket repris. Veuillez avancer.");
    }
}
