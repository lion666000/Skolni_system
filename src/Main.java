public class Main {
    public static void main(String[] args) {
        Student student = new Student("Joj", 2, 1.0);
        Student student2 = new Student("Jane", 3, 5.0);
        Student student3 = new Student("Joj", 4, 1.0);

        System.out.println(student);

        System.out.println(student.equals(student3));

        System.out.println(student2);

        student2.zlepsiPrumer(2.0);

        System.out.println(student2);

        System.out.println(student3);
        student3.klasifikace();
    }
}