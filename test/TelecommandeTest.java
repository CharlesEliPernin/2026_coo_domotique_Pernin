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

        t.ajouterAppareil(l1);

        assertEquals(1, t.getAppareils().size(), "Erreur dans le nombre de lampes");
    }

    @Test
    public void testAjouterEtAllumerHifi(){
        Telecommande t = new Telecommande();
        Hifi h1 = new Hifi();

        t.ajouterAppareil(h1);
        t.allumer(0);
        assertEquals(1, t.getAppareils().size(), "Erreur dans le nombre de lampes");
        assertEquals(10, h1.getSon(), "Erreur dans le nombre de lampes");
    }



    @Test
    public void testActiverLampe(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
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
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
        t.allumer(3);

        assertFalse(l1.isAllume(), "La lampe1 n'aurait pas dut être allumée");
        assertFalse(l2.isAllume(), "La lampe2 n'aurait pas dut être allumée");
    }

    @Test
    public void testActiverCheminee(){
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdaptateurCheminee ac = new AdaptateurCheminee(c);
        t.ajouterAppareil(ac);

        t.allumer(0);
        t.allumer(0);
        assertEquals(20, c.getLumiere(),"La luminausité n'est pas la bonne" );
    }

    @Test
    public void testEteindreCheminee(){
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdaptateurCheminee ac = new AdaptateurCheminee(c);
        t.ajouterAppareil(ac);

        for (int i = 0; i<5; i++){
            t.allumer(0);
        }
        t.eteindre(0);

        assertEquals(0,c.getLumiere(), "La luminausité devrait être de 0");

    }



}