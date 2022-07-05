import db.ComputerScienceStudendt2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Student2Test {

    @Test
    void student2NameTest(){
        //Given
        String name="Hoffmann Jan";
        ComputerScienceStudendt2 computerScienceStudendt2=new ComputerScienceStudendt2();

        //when
        String actual=computerScienceStudendt2.getStudentName(name);

        Assertions.assertEquals("Hoffmann Jan", actual);

    }
}
