import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest{

    @Test
    public void testTelecommande(){
        Telecommande t = new Telecommande();
    }

    @Test
    public void testAjouterLampe(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");

        t.ajouterLampe(l1);

        assertEquals(1, t.getLampes().size(), "Erreur dans le nombre de lampes");
    }

    @Test
    public void testActiverLampe(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerLampe(0);
        t.activerLampe(1);

        assertTrue(l1.isAllume(), "La lampe1 n'a pas été allumée");
        assertTrue(l2.isAllume(), "La lampe2 n'a pas été allumée");
    }

    @Test
    public void testActiverLampeInexistante(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerLampe(3);

        assertFalse(l1.isAllume(), "La lampe1 n'aurait pas dut être allumée");
        assertFalse(l2.isAllume(), "La lampe2 n'aurait pas dut être allumée");
    }

}