public class AbonnementMusique extends Abonnement implements Reducible{
    private int nbPlaylists;
    private boolean optionOffline;

    public AbonnementMusique(String nom, double prixBase, int nbProfiles, int nbPlaylists, boolean optionOffline)
    {
        super(nom, prixBase, nbProfiles);
        this.nbPlaylists = nbPlaylists;
        this.optionOffline = optionOffline;
    }

    public double calculerCoutMensuel()
    {
        double prix = getPrixBase(); 

        if(optionOffline){prix += 15;}
        return prix;
    }

    public int calculerScoreSatisfaction()
    {
        int score = 50;

        if(nbPlaylists > 20){score += 20;}
        if(optionOffline){score += 20;}
        if(getNbProfiles() > 1){score += 10;}

        if(score > 100){return 100;}
        return score;
    }

    public boolean estEligibleReduction(double pourcentage)
    {
        if(pourcentage > 30){return false;}
        else{return true;}
    }
    public double appliquerReduction(double pourcentage)
    {
        if(estEligibleReduction(pourcentage))
            {
                return calculerCoutMensuel() * (1 - pourcentage / 100);
            }
        else
            {
                return calculerCoutMensuel();
            }
    }
}
