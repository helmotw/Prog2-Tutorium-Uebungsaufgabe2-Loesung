package Geschaeftslogik.daten;

import java.util.LinkedList;

public class KundenDB {
    private final LinkedList<Kunde> kunden = new LinkedList<>();

    public LinkedList<Kunde> getKunden() {
        return kunden;
    }

    public boolean hinzufuegen(Kunde k){
        return this.kunden.add(k);
    }
    public boolean entfernen(Kunde k){
        return this.kunden.remove(k);
    }

    public int getKundenAnzahl(){
        return kunden.size();
    }


}
