package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        String a;
        System.out.println("Qual a Temperatura ?");
        temp = sc.nextInt();
        a = (temp <= 15) ? "Frio" :
                (temp<25) ? "Agradevel":
                         (temp>25)? "quente":"";
        System.out.println(a);
        sc.close();


    }
}


