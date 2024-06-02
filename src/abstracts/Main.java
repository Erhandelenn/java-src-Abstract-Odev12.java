package abstracts;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Erhan", "Delen", 25, "50214526456", 2.82);
        Teacher teacher = new Teacher("Bilal", "Demir", 32, "6587654321",
                new String[]{"JAVA", "SQl","Backend"}, "Bilgisayar Mühendisi");
        Staff staff = new Staff("Mehmet", "Ekşi", 50, "68548451254", "Hademe");

        Person[] persons = {student, teacher, staff};

        for (Person person : persons) {
            person.yazdir();
        }
    }
}