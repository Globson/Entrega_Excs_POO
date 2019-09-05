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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com o nome do mes:");
        String mes = sc.nextLine();
        String Meses[] = new String[12];
        Meses[0] = "Janeiro";
        Meses[1] = "Fevereiro";
        Meses[2] = "Marco";
        Meses[3] = "Abril";
        Meses[4] = "Maio";
        Meses[5] = "Junho";
        Meses[6] = "Julho";
        Meses[7] = "Agosto";
        Meses[8] = "Setembro";
        Meses[9] = "Outubro";
        Meses[10] = "Novembro";
        Meses[11] = "Dezembro";
        for(int i = 0; i<12;i++){
         if(!mes.equals(Meses[i])){
        } else {
             int a = i+1;
             System.out.println(Meses[i]+" = "+a);
            }
        }
        sc.close();
    }


}
