import java.util.Locale;
import java.util.Scanner;

public class EX5_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número: ");
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        if (n < 0) {
            System.out.println("Negativo");
        }
        else if (n > 0) {
            System.out.println("Não Negativo");
        }
        else {
            System.out.println("Numero Zero");
        }
        sc.close();
    }
}
