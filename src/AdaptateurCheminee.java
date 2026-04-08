public class AdaptateurCheminee implements Appareil {
    private Cheminee cheminee;

    public AdaptateurCheminee(Cheminee c){
        this.cheminee = c;
    }
    public void allumer(){
        if (cheminee.getLumiere() +10 <= 100){
            cheminee.changerIntensite(cheminee.getLumiere() +10);
        }
    }

    public void eteindre(){
        cheminee.changerIntensite(0);
    }

    public String toString(){
        return cheminee.toString();
    }


}
