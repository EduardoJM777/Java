package exercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class ex5_EduardoJM {

    public static void main(String[] args) {
        
       int num1;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite um número: ");
       num1 = s.nextInt();
       
       if (num1%2 == 0){
          System.out.println("O número informado é PAR!");
       } else {
          System.out.println("O número informado é IMPAR!");
       }
        
    }
    
}
