package exercicios;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class ex1_EduardoJM {
    
    public static void main(String args[]){
        
        double nota;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        nota = s.nextDouble();
        
        if (nota>=6){
           System.out.println("APROVADO!");
        } else if (nota<6 && nota>=4){
           System.out.println("Precisa fazer prova substitutiva.");
        } else {
           System.out.println("REPROVADO!");
        }
       
    }
    
    
}
