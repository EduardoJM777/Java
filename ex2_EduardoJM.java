package exercicios;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class ex2_EduardoJM {
    
    public static void main (String []args){
    
       String nome, genero, corFavorita, esporte;
       int idade;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite seu nome: ");
       nome = s.next();
       
       System.out.println("Digite sua idade: ");
       idade = s.nextInt();
       
       System.out.println("Digite seu gênero: ");
       genero = s.next();
       
       System.out.println("Digite sua cor favorita: ");
       corFavorita = s.next();
       
       System.out.println("Pratica esportes? [S/N]");
       esporte = s.next();
       
       System.out.println("\nNome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Gênero: " + genero);
       System.out.println("Cor Favorita: " + corFavorita);
       System.out.println("Pratica esportes: " + esporte);
       
    }
}
