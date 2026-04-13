package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio11 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1;
    int soma;
    System.out.println("Digite um numero ");
    n1= sc.nextInt();

    String i = ( n1%5==0 ) ? "divisivel por 5 ": "Nao divisivel por 5";
    System.out.println(i);
}}
