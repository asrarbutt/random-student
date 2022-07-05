package Model;

public class ComputerScienceStudent extends Student{

    String favProgLang;


    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String name, int id, String favProgLang) {

        super(name, id);
        this.favProgLang=favProgLang;


    }

    public String getFavProgLang() {
        return favProgLang;
    }

    public void setFavProgLang(String favProgLang) {
        this.favProgLang = favProgLang;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "favProgLang='" + favProgLang + '\'' +
                '}'+" name: "+ getName()+ " ID: "+ getId();
    }
}
