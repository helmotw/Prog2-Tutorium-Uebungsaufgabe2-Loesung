package Geschaeftslogik;

import Geschaeftslogik.daten.Kunde;
import Geschaeftslogik.daten.KundenDB;

public class JahresEinnahmenrechner {
    static public double berechnung(final KundenDB kdb){
        double res =0;
        for (Kunde node:kdb.getKunden()){
            double jahrespraemie=node.getPraemie();
            for(int i = 0;i<12;i++){
                jahrespraemie+=jahrespraemie*0.1;
            }
            if (node.getBmi()>30.0){
                jahrespraemie+=jahrespraemie*0.1;
            }
            if (node.isRaucher()){
                jahrespraemie+=jahrespraemie*0.5;
            }
            if (node.getKinderanzahl()>2){
                jahrespraemie-=jahrespraemie*0.5;
            }
            res+=jahrespraemie;
        }
        return res;
    }
}
