public class Student {
    private String jmeno;
    private int rocnik;
    private Double prumer;



    Student(String jmeno, int rocnik, Double prumer) {
        this.jmeno = jmeno;
        if ((rocnik>=1)&&(rocnik<=4)){
            this.rocnik = rocnik;
        }
        else{
            System.err.println("Špatný formát ročníku!");
        }

        if ((prumer>=1.0)&&(prumer<=5.0)){
            this.prumer = prumer;
        }
        else{
            System.err.println("Špatný formát průměru!");
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public Double getPrumer() {
        return prumer;
    }

    public void setPrumer(Double prumer) {
        this.prumer = prumer;
    }

    public String toString(){
        return jmeno+" (Ročník: "+rocnik+", průměr: "+prumer + ")";
    }

    public boolean equals(Student druhyObjekt){
        if((jmeno.equals(druhyObjekt.jmeno))&&(prumer.equals(druhyObjekt.prumer))){
            return true;
        }
        else{
            return false;
        }
    }


    public void zlepsiPrumer(double oKolik){
        if ((prumer -= oKolik)<=1.0){
            prumer = 1.0;
        }
        else{
            prumer -= oKolik;
        }
    }
    public void klasifikace(){
        if ((prumer>=1.0)&&(prumer<=1.5)){
            System.out.println("Výborný");
        } else if ((prumer>=1.5)&&(prumer<=2.5)) {
            System.out.println("Chvalitebný");
        } else if ((prumer>=2.5)&&(prumer<=3.5)) {
            System.out.println("Dobrý");
        } else if ((prumer>=3.5)&&(prumer<=4.5)) {
            System.out.println("Dostatečný");
        }
        else{
            System.out.println("Nedostatečný");
        }
    }

    public void popis(){
        System.out.print("Student: " + jmeno+" (ročník " + rocnik + ", průměr " + prumer + "), klasifikace: ");
        klasifikace();
    }
}