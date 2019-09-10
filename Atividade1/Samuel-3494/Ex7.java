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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os horarios na seguinte formatacao: HH:MM:SS");
        System.out.print("Entre com o primeiro horario:");
        String linha = sc.nextLine();
        String partes1[] = new String[3];
        partes1 = linha.split(":");
        System.out.print("Entre com o segundo horario:");
        String linha2 = sc.nextLine();
        String partes2[] = new String[3];
        partes2 = linha2.split(":");
        int hora1 = Integer.parseInt(partes1[0]);
        int minuto1 = Integer.parseInt(partes1[1]);
        int segundo1 = Integer.parseInt(partes1[2]);
        int hora2 = Integer.parseInt(partes2[0]);
        int minuto2 = Integer.parseInt(partes2[1]);
        int segundo2 = Integer.parseInt(partes2[2]);
        int horario1 = segundo1 + (minuto1*60) + (hora1*3600);
        int horario2 = segundo2 + (minuto2*60) + (hora2*3600);
        int diferenca;
        if(horario1 > horario2){
            diferenca = horario1 - horario2;
            System.out.println("A diferença de horario em segundos é: "+diferenca);
        }else if(horario2 > horario1){
            diferenca = horario2 - horario1;
            System.out.println("A diferença de horario em segundos é: "+diferenca);
        }else{
            System.out.println("A diferença de horario em segundos é: 0");
        }
        sc.close();
    }

}
