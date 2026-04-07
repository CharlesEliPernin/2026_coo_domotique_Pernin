import java.util.ArrayList;
import java.util.List;

public class Telecommande{

    private List<Lampe> lampes;
    private List<Hifi> hifis;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>(0);

    }

    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }
    public void ajouterHifi(Hifi h){
        this.hifis.add(h);
    }

    public void activerLampe(int indice) {
        if (indice < lampes.size()) {
            this.lampes.get(indice).allumer();
        }
    }
    public void activerHifi(int indice) {
        if (indice < hifis.size()) {
            this.hifis.get(indice).allumer();
        }
    }

    public void desactiverLampe(int indice) {
        if (indice < lampes.size()) {
            this.lampes.get(indice).eteindre();
        }
    }
    public void desactiverHifi(int indice) {
        if (indice < hifis.size()) {
            this.hifis.get(indice).eteindre();
        }
    }

    public void activerTout(){
        for (Lampe elt : this.lampes){
            elt.allumer();
        }
    }

    public void activerToutHifi(){
        for (Hifi elt : this.hifis){
            elt.allumer();
        }
    }

    public List<Lampe> getLampes(){
        return this.lampes;
    }

    public List<Hifi> getHifis(){
        return this.hifis;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < this.lampes.size(); i++){
            res += "Lampe " + i + " " + this.lampes.get(i).toString() + "\n";
        }
        for (int i = 0; i < this.hifis.size(); i++){
            res += "Hifi " + i +"\n";
        }

        return res;
    }
}