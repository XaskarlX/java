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

        //----------------------

        Employe e1 = new Employe(1, "lowel");
        Employe e2 = new Employe(2, "thnen");
        Employe e3 = new Employe(3, "theth");

        AffectationHashMap gestionAffectation = new AffectationHashMap();
        gestionAffectation.ajouterEmployeDepartement(e1, d1);

        gestionAffectation.ajouterEmployeDepartement(e2, d2);
        gestionAffectation.ajouterEmployeDepartement(e3, d1);

        gestionAffectation.afficherEmployesEtDepartements();
        gestionAffectation.afficherDepartements();

        System.out.println(gestionAffectation.rechercherEmploye(e1));

        System.out.println(gestionAffectation.rechercherDepartement(d2));
    }
}

