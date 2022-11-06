import Geschaeftslogik.util.CSVReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CSVReaderTest {

    @Test
    void readCSV() {
        assertDoesNotThrow(() -> CSVReader.readCSV("insurance.csv"));
    }

    @Test
    void readCSVfail() {
        assertThrows(IOException.class,() -> CSVReader.readCSV("ance.csv"));
    }
}