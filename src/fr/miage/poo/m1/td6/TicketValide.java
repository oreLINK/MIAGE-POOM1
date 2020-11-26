package fr.miage.poo.m1.td6;

public class TicketValide implements EtatTourniquet {

    @Override
    public void changeState(Tourniquet tourniquet) {
        tourniquet.Etat = Etats.TICKET_VALIDE;
    }

    @Override
    public void display(Tourniquet tourniquet) {
        System.out.println("Tourniquet : Ticket valide. Veuillez reprendre votre ticket.");
    }
}
