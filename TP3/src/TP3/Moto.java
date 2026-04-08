package TP3;

public class Moto extends Vehicule{
    private boolean avecCasque;

    public Moto(String matricule, String marque, boolean avecCasque)
    {
        super(matricule, marque);
        this.avecCasque = avecCasque;
    }

    public void stationner()
    {
        System.out.println("La moto se fare dans une place reservee aux deux-roues.");
    }

    public void afficher()
    {
        super.afficher();
        System.out.println("avecCasque : " +  avecCasque);
    }
}
