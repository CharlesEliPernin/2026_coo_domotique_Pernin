package donnees;

public class ComparateurAlbum implements ComparateurCd{
    public ComparateurAlbum(){

    }
    public boolean etreAvant(CD cd1, CD cd2){
        return cd1.getNomCD().compareTo(cd2.getNomCD()) <= 0;
    }
}
