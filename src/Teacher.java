public class Teacher {
    public String teacherName;

    public Teacher(String teacherName){
        this.teacherName = teacherName;
        System.out.println(teacherName + "Was created");
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.grade =finalGrade;


    }
}
