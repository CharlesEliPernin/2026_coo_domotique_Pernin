
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		
		Hifi h1 = new Hifi();
		t.ajouterAppareil(h1);

		Cheminee c1 = new Cheminee();
		AdaptateurCheminee ac = new AdaptateurCheminee(c1);
		t.ajouterAppareil(ac);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
