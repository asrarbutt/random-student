package db;

import Model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {

    Student[] allStudent;

    ArrayList<Student> allStudentArrayList=new ArrayList<>();

    public StudentDB() {
    }

    public StudentDB(ArrayList<Student> allStudentArrayList) {
        this.allStudentArrayList = allStudentArrayList;
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

    public ArrayList<Student> getAllStudentArrayList() {
        return allStudentArrayList;
    }

    public void setAllStudentArrayList(ArrayList<Student> allStudentArrayList) {
        this.allStudentArrayList = allStudentArrayList;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudent=" + Arrays.toString(allStudent) +
                ", allStudentArrayList=" + allStudentArrayList +
                '}';
    }
}

