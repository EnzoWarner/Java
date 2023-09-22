import java.util.Locale;
import java.util.Scanner;

public class EX5_5 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------------------------");
            System.out.println(" Codigo  Especificação   Preço   ");
            System.out.println(" 1       Cachorro Quente R$ 4,00 ");
            System.out.println(" 2       X-Salada        R$ 4,50 ");
            System.out.println(" 3       X-Bacon         R$ 5,00 ");
            System.out.println(" 4       Torrada Simples R$ 2,00 ");
            System.out.println(" 5       Refrigerante    R$ 1,50 ");
            System.out.println(" -----------------------------------");
            System.out.println(" Insira o código do produto: ");
            Locale.setDefault(Locale.US);
            double valor;
            int cod = sc.nextInt();
            if (cod > 6) {
                System.out.println("Esse produto não existe");
            }
            else if (cod <= 5) {
                System.out.println("Insira a quantidade de produtos: ");
                int q = sc.nextInt();
                switch (cod) {
                    case 1:
                        valor = q * 4;
                        System.out.println("Voce pediu " + q + " Cachorro(s) Quente(s), e o valor a ser pago é " + valor);
                        break;
                    case 2:
                        valor = q * 4.5;
                        System.out.println("Voce pediu " + q + " X-Salada(s), e o valor a ser pago é " + valor);
                        break;
                    case 3:
                        valor = q * 5;
                        System.out.println("Voce pediu " + q + " X-Bacon(s), e o valor a ser pago é " + valor);
                        break;
                    case 4:
                        valor = q * 2;
                        System.out.println("Voce pediu " + q + " Torrada(s) Simples(s), e o valor a ser pago é " + valor);
                        break;
                    case 5:
                        valor = q * 1.5;
                        System.out.println("Voce pediu " + q + " Refrigerante(s), e o valor a ser pago é " + valor);
                        break;
                    default:
                }
            }
        }

    }
