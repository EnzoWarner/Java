import java.util.Locale;
import java.util.Scanner;

public class EX5_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a hora inicial: ");
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Insíra a hora Final: ");
        int n1 = Integer.parseInt(sc.nextLine());
        if (n < n1 ) {
            System.out.println("O jogo durou " + (n1 - n) + " horas");
        }
        else if (n == n1) {
            System.out.println("O jogo durou 24 horas");
        }
        else {
            System.out.println("O jogo durou " + ((n1 + 24) - n) + " Horas");
        }
        sc.close();
    }
}
