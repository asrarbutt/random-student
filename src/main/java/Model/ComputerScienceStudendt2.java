package Model;

import Model.Student;
import Model.Student2;

public class ComputerScienceStudendt2 extends Student2 implements Citizen{




    @Override
    public String getStudentName(String name) {
        return name;
    }


    @Override
    public String getAdress(String adress) {
        return adress;
    }

    @Override
    public int getIdentityCardNumber(int id) {
        return id;
    }


}
