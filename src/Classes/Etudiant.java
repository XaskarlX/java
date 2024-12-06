package Classes;
import java.util.Objects;

public class Etudiant {
    private int id;
    private String nometu;
    private int age;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nometu = nometu;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnometu() {
        return nometu;
    }

    public void setnometu(String nometu) {
        this.nometu = nometu;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nometu='" + nometu + ", age=" + age ;
    }

}

