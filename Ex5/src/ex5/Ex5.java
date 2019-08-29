/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex5 {
    public enum OpcoesMenu {    
    Janeiro(1),Fevereiro(2),Marco(3),Abril(4),Maio(5),Junho(6),Julho(7),Agosto(8),Setembro(9),Outubro(10),Novembro(11),Dezembro(12);
     
    private final int valor;
    OpcoesMenu(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.printf("Entre com o nome do mes:");
        String mes = sc.nextLine();
        OpcoesMenu Mes = mes;
        
    }   
    
}
