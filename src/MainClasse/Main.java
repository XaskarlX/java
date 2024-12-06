package MainClasse;
import Classes.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        List<Etudiant> students = Arrays.asList(
                new Etudiant(1, "lowel", 20),
                new Etudiant(2, "theni", 26),
                new Etudiant(3, "le5er", 19)
        );


        System.out.println("Etudiants :");
        studentManagement.displayStudents(students, System.out::println);

        System.out.println("\n age > 20 :");
        studentManagement.displayStudentsByFilter(students, s -> s.getAge() > 20, System.out::println);

        System.out.println("\nles noms :");
        String names = studentManagement.returnStudentsNames(students, Etudiant::getnometu);
        System.out.println(names);

        Etudiant newStudent = studentManagement.createStudent(() -> new Etudiant(4, "David", 21));
        System.out.println("\nNew Student Created: " + newStudent);

        System.out.println("\nStream etudiants:");
        studentManagement.convertToStream(students).forEach(System.out::println);
    }
}

