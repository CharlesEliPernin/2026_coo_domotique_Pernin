import java.util.ArrayList;
import java.util.List;

public class Telecommande{

    private List<ObjetConnecte> objetsConnectes;

    public void allumer(int indice){
        if (indice < objetsConnectes.size()){
            objetsConnectes.get(indice).allumer();
        }
    }
    public void eteindre(int indice){
        if (indice < objetsConnectes.size()){
            objetsConnectes.get(indice).eteindre();
        }
    }

    public void allumerTout(){
        for (ObjetConnecte obj : objetsConnectes){
            obj.allumer();
        }
    }

    public void ajouterObjet(ObjetConnecte obj){
        objetsConnectes.add(obj);
    }

    public List<ObjetConnecte> getObjetsConnectes() {
        return objetsConnectes;
    }

    public String toString(){
        String res = "";
        for (ObjetConnecte obj : objetsConnectes){
            res += obj.toString() + "\n";
        }
        return res;
    }
}