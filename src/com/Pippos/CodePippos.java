package com.Pippos;
import java.util.Scanner;

public class CodePippos {
    public static void main(String[] args) {
        
        double ValorPippos = 3.75;
        
        System.out.println("Qual é o valor?");
        Scanner Pip = new Scanner(System.in);
        double userInput = Pip.nextDouble(); // Ler a entrada do usuário
        
        if (userInput == ValorPippos) {
            System.out.println("Mesmo valor");
        }
        else if (userInput > ValorPippos) {
            System.out.println("Oxe, muito caro");
        }
        else {
            System.out.println("Mais barato");
        }
        
        Pip.close(); // Fechar o Scanner
    }
}
