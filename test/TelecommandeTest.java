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

        t.ajouterObjet(l1);

        assertEquals(1, t.getObjetsConnectes().size(), "Erreur dans le nombre de lampes");
    }

    @Test
    public void testAjouterEtAllumerHifi(){
        Telecommande t = new Telecommande();
        Hifi h1 = new Hifi();

        t.ajouterObjet(h1);
        t.allumer(0);
        assertEquals(1, t.getObjetsConnectes().size(), "Erreur dans le nombre de lampes");
        assertEquals(10, h1.getSon(), "Erreur dans le nombre de lampes");
    }



    @Test
    public void testActiverLampe(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterObjet(l1);
        t.ajouterObjet(l2);
        t.allumer(0);
        t.allumer(1);

        assertTrue(l1.isAllume(), "La lampe1 n'a pas été allumée");
        assertTrue(l2.isAllume(), "La lampe2 n'a pas été allumée");
    }

    @Test
    public void testActiverLampeInexistante(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterObjet(l1);
        t.ajouterObjet(l2);
        t.allumer(3);

        assertFalse(l1.isAllume(), "La lampe1 n'aurait pas dut être allumée");
        assertFalse(l2.isAllume(), "La lampe2 n'aurait pas dut être allumée");
    }



}