import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisão;
        int valor1;
        int valor2;
        System.out.println(" Insira dois numeros inteiros: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        do {
            try {
                divisão = valor1 / valor2;
                System.out.println("A divisão é: " + divisão);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Opção Invalida");
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Opção Invalida");
                break;
            } catch (ArithmeticException e2) {
                System.out.println("Opção Invalida");
                continue;
            }
        }
        while (valor2 != 0);
    }
}

