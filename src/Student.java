public class Student {
    public String name;
    public int grade;

    public Student(String name){
        this.name = name;
        this.grade= 0;
        System.out.println("student " + this.name + " was created");
    }
    public void getStudentDetails(){
        System.out.println("Student details: \nname:" + name +"\ngrade:"  + grade);
    }
}

