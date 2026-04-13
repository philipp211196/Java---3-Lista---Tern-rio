package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio15 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l1,l2,l3;
    String a;
    System.out.println("Digite os 3 numeros para vermos se forma um triangulo.");
    l1 = sc.nextInt();
    l2 = sc.nextInt();
    l3 = sc.nextInt();
    a=(l1+l2>l3 && l2+l3>l1 && l3+l1>l2)
             ?"Estes numeros formam um triangulo.":"Estes numeros nao formam triangulo.";
        System.out.println(a);

    }
}
