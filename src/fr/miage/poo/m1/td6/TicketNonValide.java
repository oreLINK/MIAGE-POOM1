package fr.miage.poo.m1.td6;

public class TicketNonValide implements EtatTourniquet {
    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.TICKET_NON_VALIDE;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : *BIP* Ticket non valide. *BIP* Veuillez reprendre votre ticket.");
    }
}
