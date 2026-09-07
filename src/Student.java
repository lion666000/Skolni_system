public class Student {
    private String jmeno;
    private int rocnik;
    private double prumer;

    public Student(String jmeno, int rocnik, double prumer) {
        this.jmeno = jmeno;
        if (rocnik > 0 && rocnik < 5){
            this.rocnik = rocnik;
        }
        if (prumer >= 1.0 && prumer <= 5.0 ){
            this.prumer = prumer;
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getRocnik() {
        return rocnik;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }


    public void zlepsiPrumer(double oKolik){
        prumer -= oKolik;
        if (prumer < 1.0){
            prumer = 1.0;
        }
    }

    public void klasifikace(){
        if (prumer >= 4.2){
            System.out.println("Nedostatečný");
        } else if (prumer>= 3.6) {
            System.out.println("Dostatečný");
        } else if (prumer>= 2.5) {
            System.out.println("Dobrý");
        } else if (prumer>= 1.8) {
            System.out.println("Chvalitebný");
        } else if (prumer>= 1.0) {
            System.out.println("Výborný");
        }
    }





    public String toString(){
        return jmeno + "(ročník " + rocnik + ", průměr " + prumer + ")\n";
    }

    public boolean equals(Student student2){

        if ((jmeno.equals(student2.jmeno)) && (prumer == student2.prumer)){
            return true;
        }
        else{
            return false;
        }
    }
}
