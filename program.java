import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}