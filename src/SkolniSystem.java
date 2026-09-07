import java.util.ArrayList;

public class SkolniSystem {
    ArrayList<Student> students = new ArrayList<>();

    public void pridatStudenta(Student student){
        students.add(student);
    }

    public void vypsatStudenty(){
        for(Student student : students){
            System.out.println(student);
        }
    }

    public void najitDleJmena(String jmeno){
        for(Student student : students){
            if(student.getJmeno().equals(jmeno)){
                System.out.println(student);
            }
        }
    }
}