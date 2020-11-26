package fr.miage.poo.m1.td6;

public class Tourniquet {

    private EtatTourniquet etatTourniquet;
    public Etats Etat;

    public Tourniquet() {
        this.setState(new Initialisation());
    }

    public void setState(EtatTourniquet etatTourniquet){
        this.etatTourniquet = etatTourniquet;
        etatTourniquet.changeState(this);
        etatTourniquet.display(this);
    }

    public void action(Actions action){

        if(action.equals(Actions.INSERER_BON_TICKET) && this.Etat.equals(Etats.INITIALISATION)){
            System.out.println("Utilisateur : Insertion d'un bon ticket.");
            this.setState(new TicketValide());
        }
        else if(action.equals(Actions.INSERER_MAUVAIS_TICKET) && this.Etat.equals(Etats.INITIALISATION)){
            System.out.println("Utilisateur : Insertion d'un mauvais ticket.");
            this.setState(new TicketNonValide());
        }
        else if(action.equals(Actions.PRENDRE_TICKET) && (this.Etat.equals(Etats.TICKET_VALIDE) ||
                (this.Etat.equals(Etats.TICKET_NON_VALIDE)))) {
            if(this.Etat.equals(Etats.TICKET_VALIDE)) {
                System.out.println("Utilisateur : Reprend le bon ticket.");
                this.setState(new Passer());
            } else if(this.Etat.equals(Etats.TICKET_NON_VALIDE)) {
                System.out.println("Utilisateur : Reprend le mauvais ticket");
                this.setState(new Initialisation());
            }
        }
        else if(action.equals(Actions.AVANCER) && this.Etat.equals(Etats.PASSER)){
            System.out.println("Utilisateur : Passe dans le tourniquet. Le tourniquet se referme.");
            this.setState(new Initialisation());
        }

        else if(action.equals(Actions.PANNE) && !this.Etat.equals(Etats.MAINTENANCE)) {
            System.out.println("PANNE DETECTEE !");
            this.setState(new HorsService());
        }

        else if(action.equals(Actions.REPARATION) && this.Etat.equals(Etats.HORS_SERVICE)) {
            System.out.println("Technicien : Réparation du tourniquet en cours.");
            this.setState(new Initialisation());
        }

        else if(action.equals(Actions.MISE_EN_MAINTENANCE)) {
            System.out.println("Technicien : Mise en maintenance du tourniquet");
            this.setState(new Maintenance());
        }

        else if(action.equals(Actions.REPRISE_SERVICE) && this.Etat.equals(Etats.MAINTENANCE)) {
            System.out.println("Technicien : Reprise du service sur ce tourniquet en cours");
            this.setState(new Initialisation());
        }

        else {
            if(this.Etat.equals(Etats.HORS_SERVICE)){
                System.out.println("ERREUR. Cette action n'est pas autorisée. Tourniquet en panne.");
            } else if(this.Etat.equals(Etats.MAINTENANCE)){
                System.out.println("ERREUR. Cette action n'est pas autorisée. Tourniquet en maintenance.");
            } else {
                System.out.println("ERREUR. Cette action n'est pas autorisée. Réinitialisation du tourniquet.");
                this.setState(new Initialisation());
            }
        }
    }
}
