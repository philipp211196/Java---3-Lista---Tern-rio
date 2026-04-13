package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int i;

        System.out.println("Digite tres numeros inteiros  ");
       a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        i = (a > b && a > c ) ? a:(b>c) ? b : c;
        System.out.println("Seu maior numero e "+i);
    }}