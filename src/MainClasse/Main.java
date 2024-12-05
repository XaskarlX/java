package MainClasse;
import Classes.*;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "dep1", 10);
        Departement d2 = new Departement(2, "dep2", 25);
        Departement d3 = new Departement(3, "dep3", 15);

        gestionDepartements.ajouterDepartement(d1);

        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        System.out.println("les Department : ");
        gestionDepartements.displayDepartement();

        System.out.println(gestionDepartements.rechercherDepartement("dep1"));

        System.out.println("\ndelete dep1 ...");
        gestionDepartements.supprimerDepartement(d2);

        System.out.println("re display  les deps :");
        gestionDepartements.displayDepartement();

        System.out.println("tri ... :");
        for (Departement d : gestionDepartements.trierDepartementById()) {
            System.out.println(d);
        }
    }
}

