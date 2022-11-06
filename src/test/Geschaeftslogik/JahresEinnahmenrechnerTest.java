package Geschaeftslogik;

import Geschaeftslogik.daten.Kunde;
import Geschaeftslogik.daten.KundenDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JahresEinnahmenrechnerTest {

    @Test
    void berechnung() {
        KundenDB testdb=new KundenDB();
        testdb.hinzufuegen(new Kunde(37,"female",37.74,3,true,"northwest",1.0));
        assertEquals(0.5974989722274768,JahresEinnahmenrechner.berechnung(testdb));
    }
}
