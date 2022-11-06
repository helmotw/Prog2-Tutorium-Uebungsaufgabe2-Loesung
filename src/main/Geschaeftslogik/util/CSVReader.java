package Geschaeftslogik.util;

import Geschaeftslogik.daten.Kunde;
import Geschaeftslogik.daten.KundenDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    static public KundenDB readCSV(final String dateipfad) throws IOException{
        KundenDB res = new KundenDB();
        BufferedReader reader = new BufferedReader(new FileReader(dateipfad));
        String line;
        boolean raucher=false;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parsedline = line.split(",");
            if(parsedline[4].strip().equals("yes")){
                raucher = true;
            }
            res.hinzufuegen(new Kunde(
                    Integer.parseInt(parsedline[0]),
                    parsedline[1],
                    Double.parseDouble(parsedline[2]),
                    Integer.parseInt(parsedline[3]),
                    raucher,
                    parsedline[5],
                    Double.parseDouble(parsedline[6]) ));
        }
        return res;
    }
}
