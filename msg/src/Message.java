class Message {
    String contenu;
    String expediteur;
    Date dateEnvoi;


    public Message(String contenu, String expediteur, Date dateEnvoi) {
        this.contenu = contenu;
        this.expediteur = expediteur;
        this.dateEnvoi = dateEnvoi;
    }


    public String afficher() {
        return "Message de " + expediteur + ": " + contenu + " (Envoyé le: " + dateEnvoi.afficher() + ")";
    }
}
