import java.util.Locale;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println(" Insira quantos números voce ira digitar: ");
        int x = Integer.parseInt(sc.nextLine());
        int[] n = new int[x];
        for (int i = 0; i < n.length; i++) {
            System.out.println((i + 1) + "º numero: ");
            n[i] = Integer.parseInt(sc.nextLine());
        }
        int Pares = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.println("0s números pares são: " + n[i]);
                Pares++;
            }
        }
        System.out.println("A quantidade de números pares são: " + Pares);
    }
}
