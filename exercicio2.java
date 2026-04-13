package Exercicios_listas3_;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double valor;
        System.out.println("Qual o valor do seu produto?");
        valor = sc .nextDouble();
        double desconto = (valor <=100) ?valor =  valor - (valor * 0.10): valor ;

        System.out.println("O seu valor do desconto e "+valor);

        sc.close();

    }
}
