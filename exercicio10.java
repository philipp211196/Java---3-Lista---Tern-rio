package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 numeros para vermos se são iguais.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c;
        c = (a==b)?"Iguais.":"Diferentes.";
        System.out.println(c);
    }
}
