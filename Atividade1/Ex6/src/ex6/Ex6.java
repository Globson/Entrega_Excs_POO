/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o dia de nascimento:");
        int dia = sc.nextInt();
        System.out.print("Entre com o mes de nascimento(Numerico):");
        int mes = sc.nextInt();
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
        boolean Validade = false;
        if(mes == 4  || mes == 6 || mes == 9 || mes == 11){
            if(dia>0 && dia<31){
            Validade = true;
            }
        }
        else if (mes == 2){
            if(dia>0 && dia<30){
            Validade = true;
            }
        }
        else{
         if(dia>0 && dia<32){
         Validade = true;
         }
        }
        if(Validade){
        System.out.println("Data Valida! "+dia+" de "+ Meses[mes-1]);
        }else{
        System.out.println("Erro data invalida!");
        }
    }
    
}
