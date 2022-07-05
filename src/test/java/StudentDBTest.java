import Model.Student;
import db.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentDBTest {


    @Test
    void arrayStorageTest(){
        //Given
        Student[] students=new Student[0];

        //when
        StudentDB studentDB=new StudentDB(students);
        Student[] actual=studentDB.getAllStudent();

        //then
        Assertions.assertEquals(students, actual);



    }
 @Test
    void randomStudent(){
        //Given
        Student[] students=new Student[]{
                new Student("Jan Hoffmann", 123),
                new Student("Peter Pane", 321)
        };

        //when
        StudentDB studentDB=new StudentDB(students);
        Student[] actual=studentDB.getAllStudent();

        //then




    }


}
