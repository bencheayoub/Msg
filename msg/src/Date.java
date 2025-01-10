
class Date {
    int jour;
    int mois;
    int annee;

    
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public boolean egal(Date d) {
        return this.jour == d.jour && this.mois == d.mois && this.annee == d.annee;
    }


    public String afficher() {
        return jour + "/" + mois + "/" + annee;
    }
}
