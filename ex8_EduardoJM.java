package exercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class ex8_EduardoJM {

   public static void main(String []args){
   
      double val1, val2;
      Scanner s = new Scanner(System.in);
      
      System.out.println("Digite a quantidade de litros no primeiro dia: ");
      val1 = s.nextInt();
      
      System.out.println("Digite a quantidade de litros no dia 30: ");
      val2 = s.nextInt();
      
      System.out.println("\nA quantidade de litros consumida �: " + (val2-val1));
      System.out.println("A quantidade m�dia consumida por dia �: " + ((val2-val1)/30));
   
   }    
}
