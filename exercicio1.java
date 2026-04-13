package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio1 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salario;


    System.out.println("Digite o valor do salario : ");
    salario = sc.nextDouble();
    String valores = (salario > 2000) ? valores="salario alto" :  "salario baixo";
    System.out.println(valores);
    sc.close();

}}
