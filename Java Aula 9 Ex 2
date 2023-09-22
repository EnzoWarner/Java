import java.util.Locale;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println(" Insira quantos números voce ira digitar: ");
        int x = Integer.parseInt(sc.nextLine());
        double [] n = new double[x];
        for (int i = 0; i < n.length; i++) {
            System.out.println((i + 1) + "º numero: ");
            n[i] = Double.parseDouble(sc.nextLine());
        }
        for (int i = 0; i < n.length; i++) {
                System.out.println("0s elementos são: " + n[i]);
            }
        double soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma = soma + n[i];
        }
        double media = soma / x;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}
