package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio14 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota ;
    System.out.println("Digite a nota do aluno : ");
    nota= sc.nextDouble();
    String i = (nota>=7) ? "APROVADO ": "REPROVADO";
    System.out.println(i);
}}
