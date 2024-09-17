import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter nbrCages : ");

        while(!scan.hasNextInt()){
            System.out.println("valeur invalid , réessayer");
            scan.next();
        }
        int nbrCages = scan.nextInt();

        scan.nextLine();

        System.out.println("enter zooname : ");
        String zooName = scan.nextLine();
        while (zooName.trim().isEmpty()){
            System.out.println("le nom du zoo est vide ,réessayer");
            zooName = scan.nextLine();
        }

        System.out.println(zooName+ " comporte " +nbrCages + " cages" );

    }
}
