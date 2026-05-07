import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Tests {
    @Test
    public void testChargeurCorrect() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = chargeur.chargerMagasin();

        assertEquals(12, mag.getNombreCds(), "Le nombre de CD n'est pas bon");

    }

    @Test
    public void testChargeurIncorrect() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("fjhzfjzovheojzovhivozjohvzfjokvhzripg/");

        assertThrows(FileNotFoundException.class, chargeur::chargerMagasin);
    }

    @Test
    public void testTriAlbums() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = chargeur.chargerMagasin();
        mag.trierAlbum();


    }
}
