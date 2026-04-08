package TP3;

public class TestParking {
    public static void main(String[] args)
    {
        Vehicule v[] = new Vehicule[4];

        v[0] = new Voiture("12345-A-1", "Dacia", 4);
        v[1] = new Voiture("67890-B-2", "Ford", 4);

        v[2] = new Moto("11111-C-3", "Kawasaki", true);

        v[3] = new Camion("99999-D-4", "Mercedes", 2);

        for (int i = 0; i < v.length; i ++)
            {
                v[i].stationner();
                v[i].afficher();
            }

        for (int i = 0; i < v.length; i ++)
            {
                if (v[i] instanceof Voiture)
                    {
                        v[i].afficher();
                    }
            }


        // wrong ------------------------------------------
        // Vehicule x = new Moto("11c22", "Yamaha", true);
        // Voiture v1 = (voiture) x;
        // System.out.println("Downcasting reussi !");


        Vehicule x = new Moto("11C22", "Yamaha", true);
        Moto m = (Moto) x;
        m.afficher();
    }
}
