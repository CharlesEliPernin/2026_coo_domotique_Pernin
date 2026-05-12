package donnees;

public class ComparateurArtiste implements ComparateurCd{
    public ComparateurArtiste(){

    }
    public boolean etreAvant(CD cd1, CD cd2){
        return cd1.getNomArtiste().compareTo(cd2.getNomArtiste()) <= 0;
    }
}
