import java.util.Locale;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println(" Insira quantos números voce ira digitar: ");
        int x = Integer.parseInt(sc.nextLine());
        double[] n = new double[x];
        double maior = 0;
        int posição = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println((i + 1) + "º numero: ");
            n[i] = Double.parseDouble(sc.nextLine());
            if (n[i] > maior) {
                maior = n[i];
                posição = i;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("A posição do maior número é: " + (posição + 1));
    }
}
