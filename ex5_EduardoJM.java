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
       
       System.out.println("Digite um n�mero: ");
       num1 = s.nextInt();
       
       if (num1%2 == 0){
          System.out.println("O n�mero informado � PAR!");
       } else {
          System.out.println("O n�mero informado � IMPAR!");
       }
        
    }
    
}
