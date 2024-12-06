package Classes;

import java.util.Objects;

public class Employe {
    private int id;
    private String nomemp;

    public Employe(int id, String nomemp) {
        this.id = id;
        this.nomemp = nomemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnomemp() {
        return nomemp;
    }

    public void setnomemp(String nomemp) {
        this.nomemp = nomemp;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nomemp, employe.nomemp);
    }

    public int hashCode() {
        return Objects.hash(id, nomemp);
    }

    @Override
    public String toString() {
        return "idemp=" + id + ", nomemp='" + nomemp ;
    }
}
