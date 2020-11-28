package classes;
import java.util.Scanner;

public class Scan {

    private static Scanner scan;    

    public int inInt(String entry) {
        System.out.println(entry);
        scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public String inString(String entry) {
        System.out.println(entry);
        scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public Float inFloat(String entry) {
        System.out.println(entry);
        scan = new Scanner(System.in);
        return scan.nextFloat();
    }
}
