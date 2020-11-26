package fr.miage.poo.m1.td6;

public class HorsService implements EtatTourniquet{
    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.HORS_SERVICE;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : Tourniquet en panne. Réparation nécessaire.");
    }
}
