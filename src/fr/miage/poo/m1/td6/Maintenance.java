package fr.miage.poo.m1.td6;

public class Maintenance implements EtatTourniquet{
    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.MAINTENANCE;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : Maintenance en cours.");
    }
}
