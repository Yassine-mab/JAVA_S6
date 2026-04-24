public class AbonnementVideo extends Abonnement implements Reducible{
    private boolean optionHD;
    private boolean option4K;


    public AbonnementVideo(String nom, double prixBase, int nbProfiles, boolean optionHD, boolean option4K)
    {
        super(nom, prixBase, nbProfiles);
        this.optionHD = optionHD;
        this.option4K = option4K;
    }

    public double calculerCoutMensuel()
    {
        double prix = getPrixBase();
        if(optionHD){prix += 10;}
        if(option4K){prix += 20;}
        return prix;
    }

    public int calculerScoreSatisfaction()
    {
        int score = 60;

        if(optionHD){score += 10;}
        if(option4K){score += 20;}
        if(getNbProfiles() >= 4){score += 10;}

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
