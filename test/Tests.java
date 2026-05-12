import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.ComparateurCd;
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
    public void testTriGeneriqueParCD() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = chargeur.chargerMagasin();
        ComparateurAlbum compa = new ComparateurAlbum();
        mag.trier(compa);

        assertEquals("Believe", mag.getCd(0).getNomCD(), "Pas le bon Cd au début");
        assertEquals("Whitney Houston", mag.getCd(11).getNomCD(), "Pas le bon Cd à la fin");
    }

    @Test
    public void testTriGeneriqueParArtiste() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = chargeur.chargerMagasin();
        ComparateurArtiste compa = new ComparateurArtiste();
        mag.trier(compa);

        assertEquals("Bénabar", mag.getCd(0).getNomArtiste(), "Pas le bon Cd au début");
        assertEquals("Zebda", mag.getCd(11).getNomArtiste(), "Pas le bon Cd à la fin");
    }
}
