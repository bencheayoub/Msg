import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entree = new Scanner(System.in);

        // Création d'un tableau pour stocker 10 messages
        Message[] messages = new Message[10];


        for (int i = 0; i < messages.length; i++) {
            System.out.println("\nMessage " + (i + 1) + ":");

            System.out.print("Contenu: ");
            String contenu = Entree.next();

            System.out.print("Expéditeur: ");
            String expediteur = Entree.next();

            System.out.print("Jour: ");
            int jour = Entree.nextInt();

            System.out.print("Mois: ");
            int mois = Entree.nextInt();

            System.out.print("Année: ");
            int annee = Entree.nextInt();


            messages[i] = new Message(contenu, expediteur, new Date(jour, mois, annee));
        }

        // Recherche des messages envoyés à une date donnée
        System.out.println("\nRechercher les messages envoyés à une date donnée:");

        System.out.print("Jour: ");
        int jourRecherche = Entree.nextInt();

        System.out.print("Mois: ");
        int moisRecherche = Entree.nextInt();

        System.out.print("Année: ");
        int anneeRecherche = Entree.nextInt();

        Date dateRecherchee = new Date(jourRecherche, moisRecherche, anneeRecherche);

        // Affichage des messages correspondant à la date recherchée
        boolean trouve = false;
        for (Message message : messages) {
            if (message.dateEnvoi.egal(dateRecherchee)) {
                System.out.println(message.afficher());
                trouve = true;
            }
        }


        if (!trouve) {
            System.out.println("Aucun message trouvé pour cette date.");
        }

        // Fermeture du scanner
        Entree.close();
    }
}