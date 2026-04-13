package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int id= sc.nextInt();
        String a = (id>=16)? "Voto permitido": "Voto não permitido";
        System.out.println(a);
        sc.close();
    }
}
