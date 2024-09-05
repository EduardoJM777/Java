package exercicios;



import java.util.Scanner;

/**
 *
 * @author user
 */

public class ex7_EduardoJM {
    
   public static void main(String []args){
      
      int num1, num2; 
      Scanner s = new Scanner(System.in);
      
      System.out.println("Digite o valor 1: ");
      num1 = s.nextInt();
      
      System.out.println("Digite o valor 2: ");
      num2 = s.nextInt();
      
      System.out.println("Exemplos operadores relacionais: ");
      System.out.println("(num1)Maior que(num2): " + (num1>num2));
      System.out.println("(num1)Menor que(num2): " + (num1<num2));
      System.out.println("Iguais: " + (num1==num2));
      System.out.println("Diferentes: " + (num1!=num2));
      
   } 
}
