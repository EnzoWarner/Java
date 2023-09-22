import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        int[] valor = new int[2];
        System.out.println(" Insira dois numeros inteiros: ");

        do {
            try {
                for (i = 0; i <= valor.length; i++) {
                    valor[i] = sc.nextInt();
                    soma = soma + valor[i];

                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Opção Invalida");
                continue;
            }catch (InputMismatchException e1) {
                System.out.println("Opção Invalida");
                break;
            }
        }
        while (i < 2);
        System.out.println("A soma é: " + soma);
    }
}
