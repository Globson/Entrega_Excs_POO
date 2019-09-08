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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.printf("Entre com o numerador:");
        a = sc.nextFloat();
        while(true){
            System.out.printf("Entre com o denominador:");
            b = sc.nextFloat();
            if(b!=0){
                break;
            }else{
                System.out.println("ERRO! Denominador igual a 0!");
            }
        }
        float quociente = a/b;
        System.out.println("O resultado é: "+quociente);
        sc.close();
    }

}
