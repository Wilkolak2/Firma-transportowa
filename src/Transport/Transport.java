package Transport;

import Towar.Kontener;
import Towar.Magazyn;

import java.util.ArrayList;

public abstract class Transport {

    private ArrayList<Kontener> kontenery = new ArrayList<>();

    public void przetransportuj(Magazyn z, Magazyn dokad){

    }
    public abstract void zaladuj(Kontener kontener);

}
