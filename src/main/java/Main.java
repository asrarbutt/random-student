import Model.Student;
import Model.StudentDB;

public class Main {


    public static void main(String[] args) {
        Student student=new Student("ASrar ", 125);
        Student student1=new Student("ASrar ", 125);
        Student student2=new Student("ASrar ", 125);


        Student[] allStudent=new Student[3];
        allStudent[0]=student;
        allStudent[1]=student1;
        allStudent[2]=student2;

        StudentDB studentDB=new StudentDB(allStudent);





    }
}

