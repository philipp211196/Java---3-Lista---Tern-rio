package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int id= sc.nextInt();
        String a = (id>=18)? "Maior de idade": "Menor de idade";
        System.out.println(a);
        sc.close();
    }
}
