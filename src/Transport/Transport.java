package Transport;

import Towar.Kontener;
import Towar.Magazyn;

import java.util.ArrayList;

public abstract class Transport {

    protected ArrayList<Kontener> kontenery = new ArrayList<>();

    public void przetransportuj(Magazyn z, Magazyn dokad, int iloscKontenerow){
        System.out.printf("Transportuje kontenery z %s do %s \n",z.getMiejscowosc(),dokad.getMiejscowosc());

    }
    public abstract void zaladuj(Kontener kontener);

}
