/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com a quantidade de numeros:");
    int n = sc.nextInt();
    int soma = 0;
    int produto = 1;
    int numeros[] = new int[n];
    for(int i = 0;i<n;i++){
      System.out.print("Entre com um numero:");
      numeros[i] = sc.nextInt();
    }
    for(int j = 0;j<n;j++){
      soma = soma + numeros[j];
      produto = produto * numeros[j];
    }
    System.out.println("Produto de numeros: "+produto+"\nSoma de numeros: "+soma);
  
    }

    
}
