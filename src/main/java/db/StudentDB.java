package db;

import Model.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentDB {

    Student[] allStudent;

    public StudentDB() {
    }

    public StudentDB(Student[] allStudent) {
        this.allStudent = allStudent;
    }

    public Student getRandomStudent(){

        int index= (int)(Math.random()*allStudent.length);
        System.out.println(index);

        return allStudent[index];

    }

    public void deleteStudenFromList(Student student){

        for (int i=0; i< allStudent.length;i++){

            if(student.getId()==allStudent[i].getId()){
                System.out.println(student.getId()==allStudent[i].getId());
            }
        }
    }

    public Student[] getAllStudent() {

        return allStudent;
    }

    public void setAllStudent(Student[] allStudent) {
        this.allStudent = allStudent;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudent=" + Arrays.toString(getAllStudent()) +
                '}';
    }
}
