package exercicios;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class ex3_EduardoJM {
    
   public static void main(String []args){
   
      double num1, num2;
      Scanner s = new Scanner(System.in);
   
      System.out.println("Digite o primeiro valor: ");
      num1 = s.nextDouble();
      
      System.out.println("Digite o segundo valor: ");
      num2 = s.nextDouble();
      
      System.out.println("A soma dos valores �: " + (num1 + num2));
      System.out.println("A subtra��o dos valores �: " + (num1 - num2));
      System.out.println("A multiplica��o dos valores �: " + (num1 * num2));
      System.out.println("A divis�o dos valores �: " + (num1 / num2));
      
   }
   
}
