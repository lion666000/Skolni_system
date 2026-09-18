public abstract class Osoba{
    String name;

    public Osoba(String name) {
        if (name!=null && !name.equals("")){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("name is null or empty");
        }
    }

    void popis(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.equals("")){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("name is null or empty");
        }
    }
}
