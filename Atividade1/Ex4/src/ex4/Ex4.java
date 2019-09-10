/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a,b,c,d;
        double e;
        System.out.printf("Entre com o salario bruto:");
        a = sc.nextFloat();
        System.out.printf("Entre com o total de tarifas a serem descontados:");
        b = sc.nextFloat();
        c = a -b;
        System.out.printf("Entre com o valor do pedido de emprestimo:");
        d = sc.nextFloat();
        e = c * 0.3;
        if(d>e){
            System.out.println("Infelizmente o pedido foi recusado!");
        }
        else{
            System.out.println("O pedido foi aceito!");
        }
        sc.close();
    }
    
}
