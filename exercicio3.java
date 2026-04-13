package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp;
    System.out.println("Digite a temperatura :");
    temp = sc.nextInt();
   String i = (temp >= 40) ? "temperatura elevada ": "normal";
    System.out.println(i);
    sc.close();
}}
