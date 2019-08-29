/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.printf("Entre com a quantidade de linhas da piramide:");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b=1;
       for(int i=0;i<a;i++){
           System.out.printf("\n");
           for(int j=0;j<b;j++){
                System.out.printf("*");
            }    
           b++;
       }
      System.out.printf("\n");
    }
    
}
