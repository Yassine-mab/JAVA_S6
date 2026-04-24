public class AbonnementJeux extends Abonnement{
    private int nbJeuxInclus;
    private int heuresJeuParMois;

    public AbonnementJeux(String nom, double prixBase, int nbProfiles, int nbJeuxInclus, int heuresJeuParMois)
    {
        super(nom, prixBase, nbProfiles);
        this.nbJeuxInclus = nbJeuxInclus;
        this.heuresJeuParMois = heuresJeuParMois;
    }

    public double calculerCoutMensuel()
    {
        double prix = getPrixBase();

        if(nbJeuxInclus > 50){prix += 25;}
        if(heuresJeuParMois > 40){prix += 15;}

        return prix;
    }
    public int calculerScoreSatisfaction()
    {
        int score = 40;

        if(nbJeuxInclus >= 30){score += 20;}
        if(heuresJeuParMois >= 20){score += 20;}
        if(getNbProfiles() >= 2){score += 10;}

        if(score > 100){return 100;}
        return score;
    }
}
