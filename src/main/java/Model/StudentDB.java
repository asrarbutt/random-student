package Model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentDB {

    Student [] allStudent;

    public StudentDB() {
    }

    public StudentDB(Student[] allStudent) {
        this.allStudent = allStudent;
    }

    public Student getRandomStudent(){

        int index= (int)(Math.random()*3);

        return allStudent[index];

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
