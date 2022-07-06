import Model.ComputerScienceStudent;
import Model.Student;
import Model.ComputerScienceStudendt2;
import db.StudentDB;

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
        studentDB.getAllStudentArrayList().add(student);
        studentDB.getAllStudentArrayList().add(student1);
        studentDB.getAllStudentArrayList().add(student2);





        for (int i=0; i<allStudent.length; i++){

            System.out.println(studentDB.getAllStudent());


        }

        for (int i=0; i<studentDB.getAllStudentArrayList().size(); i++){

            System.out.println("hier ist eine ArrayList " +studentDB.getAllStudentArrayList());


        }

        //Random Student aufrufen
        System.out.println(studentDB.getRandomStudent());

        //delete from Allstudent
        studentDB.deleteStudenFromList(student);


        ComputerScienceStudent computerScienceStuden=new ComputerScienceStudent("Hoffmann Müller", 321, "JAVA");

        System.out.println(computerScienceStuden);
        student=computerScienceStuden;
        System.out.println(student+  "    haha");


        //Abstracte Methoden

        ComputerScienceStudendt2 computerScienceStudendt2=new ComputerScienceStudendt2();
        System.out.println(computerScienceStudendt2.getStudentName("Hoffmann Jan"));

        //Interface

        System.out.println(computerScienceStudendt2.getAdress("Hamburg") +" id: " +computerScienceStudendt2.getIdentityCardNumber(125));



    }





}

