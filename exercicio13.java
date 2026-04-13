package Exercicios_listas3_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio13 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um ano e informaremos se ele é bissexto.");
    int ano = sc.nextInt();
    String a;
    a = (ano%4==0 && ano%100!=0)? "Ano Bissexto." : "Ano não é bissexto.";
    System.out.println(a);
    sc.close();
    }

}
