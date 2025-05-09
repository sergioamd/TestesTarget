/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Fibonacci {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Informe um número: ");
        numero = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        boolean saida = false;

        while (a <= numero) {
            if (a == numero) {
                saida = true;
                break;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        if (saida) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

}
