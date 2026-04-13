package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero para ver se é positivo ou negativo.");
        int a = sc.nextInt();
        String b = (a>=0)? "Positivo":"Negativo";
        System.out.println(b);
    }
}
