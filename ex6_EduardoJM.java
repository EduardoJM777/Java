package exercicios;


import java.util.Scanner;

/**
 *
 * @author user
 */

public class ex6_EduardoJM {
    
    public static void main (String []args){
    
       int num1;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite um valor: ");
       num1 = s.nextInt();
       
       System.out.println("\nO resultado do valor elevado a pot�ncia 2 �: " + (num1*num1));
       System.out.println("O resultado do valor elevado a pot�ncia 4 �: " + Math.pow(num1, 4));
       System.out.println("O resultado do valor elevado a pot�ncia 6 �: " + Math.pow(num1, 6));
       System.out.println("O resultado do valor elevado a pot�ncia 8 �: " + Math.pow(num1, 8));
       System.out.println("O resultado do valor elevado a pot�ncia 10 �: " + Math.pow(num1, 10));
       
    }
}
