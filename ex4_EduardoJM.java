
package exercicios;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class ex4_EduardoJM {
   
    public static void main(String []args){
 
       int num1, num2;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite o primeiro n�mero: ");
       num1 = s.nextInt();
       
       System.out.println("Digite o segundo n�mero: ");
       num2 = s.nextInt();
       
       if (num1>num2){
          System.out.println("O primero n�mero � maior que o segundo.");
       } else if (num1==num2){
          System.out.println("O primeiro n�mero � igual ao segundo.");
       } else {
          System.out.println("O primeiro n�mero � menor que o segundo.");
       }
       
    }
    
}
