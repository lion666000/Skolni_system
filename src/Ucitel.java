public class Ucitel extends Osoba implements IVypysovatelny{
    private String predmet;

    public Ucitel(String name,String predmet) {
        super(name);
        this.predmet = predmet;
    }

    public String getPredmet() {
        return predmet;
    }
    public void setPredmet(String predmet) {
        if (predmet!=null && !predmet.equals("")){
            this.predmet = predmet;
        }
        else {
            throw new IllegalArgumentException("Predmet is null or empty");
        }
    }

    @Override
    void popis() {
        System.out.println("Učitel: " + getName() + ", vyučuje: " + getPredmet());
    }

    public void radekVypisu(){
        System.out.println(name + "      | učitel | předmět: " + predmet);
    }
}
