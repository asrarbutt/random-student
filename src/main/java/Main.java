import Model.Student;
import Model.StudentDB;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student student=new Student("Jan Hoffmann ", 2344);
        Student student1=new Student("Fabian Müller ", 5432);
        Student student2=new Student("Wali Butt ", 453);


        Student[] allStudent=new Student[3];
        allStudent[0]=student;
        allStudent[1]=student1;
        allStudent[2]=student2;



        StudentDB studentDB=new StudentDB();
        studentDB.setAllStudent(allStudent);





        for (int i=0; i<allStudent.length; i++){

            System.out.println(studentDB.getAllStudent());


        }

        //Random Student aufrufen
        System.out.println(studentDB.getRandomStudent());




    }
}

