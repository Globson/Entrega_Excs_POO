/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author grobs
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int valor = gerador.nextInt(100);
        int cont=0,valor_usuario;
        while(true){
            System.out.print("Entre com o numero:");
            valor_usuario = sc.nextInt();
            cont++;
            if(valor_usuario>valor){
             System.out.println("Numero maior que o sorteado!!");
            }
            else if(valor_usuario<valor){
             System.out.println("Valor menor que o sorteado!!");
            }
            else{
             System.out.println("PARABENS! Voce acertou em: "+cont+" vezes");
             break;
            }

        }
        sc.close();
    }

}
