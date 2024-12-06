package Classes;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        students.forEach(con);
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        students.stream().filter(pre).forEach(con);
    }
    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        return students.stream().map(fun).collect(Collectors.joining(", "));
    }
    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        List<Etudiant> sortedList = new ArrayList<>(students);
        sortedList.sort(com);
        return sortedList;
    }
    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }
}
