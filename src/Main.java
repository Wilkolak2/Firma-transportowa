import Towar.Kontener;
import Towar.Magazyn;
import Towar.Towar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // tworze magazyny
        ArrayList<Magazyn> magazyny = new ArrayList<>();
        Magazyn hamburg = new Magazyn("Hamburg");
        Magazyn tokio = new Magazyn("Tokio");
        Magazyn wroclaw = new Magazyn("Wrocław");

        // 100 kontenerow z kosnolami
        for(int i = 0; i<100; i++) {
            tokio.dodajKontener(new Kontener(Towar.KONSOLE));
        }
        //50 kontenerow z bananami
        for(int i = 0; i < 50; i++){
            tokio.dodajKontener(new Kontener(Towar.BANANY));
        }

        // 100 kontenerow z meblami
        for(int i = 0; i < 100; i++){
            wroclaw.dodajKontener(new Kontener(Towar.MEBLE));
        }
    }


}