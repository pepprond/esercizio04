public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Giuseppe");

        Student stud2 = new Student("Paolo");

        Teacher teacher = new Teacher("chiara");

        teacher.assignGrade(stud1, 4);
        teacher.assignGrade(stud2,5);

        stud1.getStudentDetails();
        stud2.getStudentDetails();


    }
}