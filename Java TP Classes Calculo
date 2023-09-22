package Retangulo;

import java.util.Locale;
import java.util.Scanner;

import CalculosdoRetangulo.RetanguloCalculo;

public class CalculoRetangulo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*RetanguloCalculo A , L;
		A = new RetanguloCalculo();
		L = new RetanguloCalculo();*/
		RetanguloCalculo Ret;
		Ret = new RetanguloCalculo();
		
		System.out.println("Insira a Altura a ser calculada: ");
		Ret.h = sc.nextDouble();
		
		System.out.println("Insira a Largura a ser calculada: ");
		Ret.b = sc.nextDouble();
		
		double area = Ret.area();
		double perimetro = Ret.perimetro();
		double diagonal = Ret.diagonal();
		
		System.out.printf("a Area do retangulo é: %.4f%n" , area);
		System.out.printf("o Perimetro do retangulo é: %.4f%n" , perimetro);
		System.out.printf("a Diagonal do retangulo é: %.4f%n" , diagonal);
		
		

	}

}
