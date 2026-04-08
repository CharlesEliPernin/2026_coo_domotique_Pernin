import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class Telecommande{

    private List<Appareil> appareils;

    public Telecommande(){
        appareils = new ArrayList<Appareil>();
    }
    public void allumer(int indice){
        if (indice < appareils.size()){
            appareils.get(indice).allumer();
        }
    }
    public void eteindre(int indice){
        if (indice < appareils.size()){
            appareils.get(indice).eteindre();
        }
    }
    // copie des classes ci dessus mais avec un autre nom pour la classe TelecommaneGraphique (les tests sont deja écrit)
    public void desactiverAppareil(int indice){
        if (indice < appareils.size()){
            appareils.get(indice).eteindre();
        }
    }
    public void activerAppareil(int indice){
        if (indice < appareils.size()){
            appareils.get(indice).allumer();
        }
    }

    public void allumerTout(){
        for (Appareil obj : appareils){
            obj.allumer();
        }
    }

    public int getNombre(){
        return appareils.size();
    }

    public void ajouterAppareil(Appareil obj){
        appareils.add(obj);
    }

    public List<Appareil> getAppareils() {
        return appareils;
    }

    public String toString(){
        String res = "";
        for (Appareil obj : appareils){
            res += obj.toString() + "\n";
        }
        return res;
    }
}