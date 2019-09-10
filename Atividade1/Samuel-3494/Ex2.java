/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com o ano de nascimento: ");
        a = sc.nextInt();
        System.out.printf("Entre com o ano atual: ");
        b = sc.nextInt();
        c = b - a;
        System.out.println("Sua idade caso ja tenha feito aniversario neste ano é: " +c+ "\nCaso ainda não tenha feito aniversario este ano, sua idade é: "+(c-1));
        sc.close();
    }
    
}
