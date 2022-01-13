package com.dio.base;

public class Main {

	public static void main(String[] args) {

		boolean t1 = true;
		boolean f1 = false;
		boolean t2 = true;
		boolean f2 = false;
		
		System.out.println("The &&(and) operator:");
		System.out.println("True and true = " + (t1 && t2));
		System.out.println("True and false = " + (t1 && f1));
		System.out.println("False and false = " + (f1 && f2));
		System.out.println();
		
		System.out.println("The ||(or) operator:");
		System.out.println("True and true = " + (t1 || t2));
		System.out.println("True and false = " + (t1 || f1));
		System.out.println("False and false = " + (f1 || f2));
		System.out.println();
		
		System.out.println("The ^(xor) operator:");
		System.out.println("True and true = " + (t1 ^ t2));
		System.out.println("True and false = " + (t1 ^ f1));
		System.out.println("False and false = " + (f1 ^ f2));
		System.out.println();
		
		System.out.println("The ! operator:");
		System.out.println("True and ! = " + !t1);
		System.out.println("False and ! = " + !f1);
		System.out.println();
		
		double salarioInicial = 1100.50;
		double salarioAtual = 1956;
		double diffSalario = salarioAtual - salarioInicial;
		double beneficioInicial = 300;
		double beneficioAtual = 300;
		double diffBeneficio = beneficioAtual - beneficioInicial;
		boolean processoTrab = diffSalario <= 500 || diffBeneficio <= 50;

		double aumentoSalario = (diffSalario * 100) / salarioInicial;
		double aumentoBeneficio = (diffBeneficio * 100) / beneficioInicial;
		
		System.out.println("O aumento salarial foi de " + aumentoSalario + "%, e o aumento nos benefícios foi de " + aumentoBeneficio + "%.");
		System.out.println("Portanto, as condições para um processo são: " + processoTrab);
		}

}
