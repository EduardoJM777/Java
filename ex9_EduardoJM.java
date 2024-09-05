package exercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class ex9_EduardoJM {
   
   public static void main(String []args){
   
      double val;
      Scanner s = new Scanner(System.in);
      
      System.out.println("Digite um valor: ");
      val = s.nextDouble();
      
      if ((val>10) && (val<100)){
         System.out.printf("O valor elevado a potência 2 é: %.5f %n", (val * val));
      } else if ((val<10) || (val>100)){
         System.out.printf("A raiz quadrada do valor é: %.5f %n", Math.sqrt(val));
      }
   
   }

    
}
