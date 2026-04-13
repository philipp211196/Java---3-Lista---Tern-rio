package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros para saber o maior e menor.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d,e;
        d = (a>b && a>c)?a : (b>c) ? b : c;
        System.out.println("O maior numero é: "+d);
        e = (a<b && a<c)?a : (b<c) ? b : c;
        System.out.println("O menor numero é: "+e);
    }
}
