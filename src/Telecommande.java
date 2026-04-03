import java.util.ArrayList;
import java.util.List;

public class Telecommande{

    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>(0);

    }

    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }

    public void activerLampe(int indice){
        this.lampes.get(indice).allumer();
    }

    public void desactiverLampe(int indice){
        this.lampes.get(indice).eteindre();
    }

    public void activerTout(){
        for (Lampe elt : this.lampes){
            elt.allumer();
        }
    }

    public List<Lampe> getLampes(){
        return this.lampes;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < this.lampes.size(); i++){
            res += "Lampe " + i + " " + this.lampes.get(i).toString() + "\n";
        }

        return res;
    }
}