import Model.ComputerScienceStudendt2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Student2Test {
    ComputerScienceStudendt2 computerScienceStudendt2=new ComputerScienceStudendt2();



    @Test
    void student2NameTest(){
        //Given
        String name="Hoffmann Jan";

        //when
        String actual=computerScienceStudendt2.getStudentName(name);

        Assertions.assertEquals("Hoffmann Jan", actual);

    }

    //test for interface methoden

    @Test
    void studentAdressTest(){

        //given
        String adress="Hamburg";


        //when
        String actual=computerScienceStudendt2.getAdress(adress);
        String expected="Hamburg";

        //then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testStudentID(){
        //given
        int adress=123;


        //when
        int actual=computerScienceStudendt2.getIdentityCardNumber(adress);
        int expected=123;

        //then
        Assertions.assertEquals(expected, actual);

    }
}
