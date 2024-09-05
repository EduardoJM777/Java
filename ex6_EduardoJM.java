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
       
       System.out.println("\nO resultado do valor elevado a potência 2 é: " + (num1*num1));
       System.out.println("O resultado do valor elevado a potência 4 é: " + Math.pow(num1, 4));
       System.out.println("O resultado do valor elevado a potência 6 é: " + Math.pow(num1, 6));
       System.out.println("O resultado do valor elevado a potência 8 é: " + Math.pow(num1, 8));
       System.out.println("O resultado do valor elevado a potência 10 é: " + Math.pow(num1, 10));
       
    }
}
