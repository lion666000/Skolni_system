public class Student {
    private String jmeno;
    private int rocnik;
    private double prumer;


    public Student(String jmeno, int rocnik, double prumer) {
        this.jmeno = jmeno;
        this.rocnik = rocnik;
        this.prumer = prumer;
    }



    public String toString(){
        return jmeno + "ročník " + rocnik + ", průměr " +prumer;
    }

    public boolean equals(Student jedna, Student dva) {
        if(jedna.jmeno.equals(dva.jmeno) && jedna.prumer==dva.prumer){
            return true;
        }else{
            return false;
        }
    }


    public void zlepsiPrmer(double oKolik){
        if((prumer-oKolik)>=1){
            prumer=prumer-oKolik;
        }else{
            System.err.println("ZADANÁ ŠPATNÁ HODNOTA");
        }
    }

    public void klasifikace(){
        if(prumer<2){
            System.out.println("VÝBORNÝ");
        }
        if(prumer>=2 && prumer<3){
            System.out.println("CHVALITEBNÝ");
        }
        if(prumer>=3 && prumer<4){
            System.out.println("DOBRÝ");
        }
        if(prumer>=4 && prumer<5){
            System.out.println("DOSTATEČNÝ");
        }
        if(prumer>=5){
            System.out.println("NEDOSTATEČNÝ");
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
        if (rocnik==1 || rocnik==2 || rocnik==3 || rocnik==4) {
            this.rocnik = rocnik;
        }else{
            System.err.println("CHYBNÁ HODNOTA ROČNÍKU");
        }
    }

    public double getPrumer() {
        return prumer;


    }

    public void setPrumer(double prumer) {
        if(prumer>=1 && prumer<=5){
            this.prumer = prumer;
        }else{
            System.err.println("CHYBNÁ HODNOTA PRŮMĚRU");
        }

    }
}