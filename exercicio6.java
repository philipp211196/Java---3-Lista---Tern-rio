package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio6 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua idade.");
    int id = sc.nextInt();
    String a ;
    if (id>=0 && id<=17){
        a = (id<=12)? "Infantil":"Adolescente";
        System.out.println(a);
    }else {a = (id<=64)? "Adulto":"Idoso";
        System.out.println(a);}
}
}
