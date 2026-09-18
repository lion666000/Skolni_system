import javax.management.ObjectInstance;
import java.util.ArrayList;

public class SkolniSystem {
    ArrayList<Osoba> osoby = new ArrayList<>();

    public void pridatOsobu(Osoba osoba){
        osoby.add(osoba);
    }

    public void vypsatStudenty(){
        for(Osoba osoba : osoby){
            if (osoba instanceof Student){
                ((IVypysovatelny) osoba).radekVypisu();
            }
        }
    }

    public void vypsatOsoby(){
        for(Osoba osoba : osoby){
            ((IVypysovatelny) osoba).radekVypisu();
        }
    }

    public void najitDleJmena(String jmeno){
        for(Osoba osoba : osoby){
            if(osoba.name.equals(jmeno)){
                ((IVypysovatelny) osoba).radekVypisu();
            }
        }
    }
}