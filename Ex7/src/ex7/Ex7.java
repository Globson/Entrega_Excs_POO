/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;
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
        System.out.print("Entre com a hora:");
        int hora1 = sc.nextInt();
        System.out.print("Entre com os minutos:");
        int minuto1 = sc.nextInt();
        System.out.print("Entre com os segundos:");
        int segundo1 = sc.nextInt();
        System.out.print("Entre com a segunda hora:");
        int hora2 = sc.nextInt();
        System.out.print("Entre com os minutos:");
        int minuto2 = sc.nextInt();
        System.out.print("Entre com os segundos:");
        int segundo2 = sc.nextInt();
        int horario1 = segundo1 + (minuto1*60) + (hora1*3600);
        int horario2 = segundo2 + (minuto2*60) + (hora2*3600);
        int horario3,hora3,minuto3,segundo3;
        if(horario1 > horario2){
            horario3 = horario1-horario2;
            hora3 = horario3/3600;
            horario3 = horario3 - hora3;
            minuto3 = horario3/60;
            horario3 = horario3 - minuto3;
            segundo3 = horario3;
            System.out.println("A diferença de horario é: "+hora3+" : "+minuto3+" : "+segundo3);
        }else if(horario2 > horario1){
            horario3 = horario2-horario1;
            hora3 = horario3/3600;
            horario3 = horario3 - hora3;
            minuto3 = horario3/60;
            horario3 = horario3 - minuto3;
            segundo3 = horario3;
            System.out.println("A diferença de horario é: "+hora3+" : "+minuto3+" : "+segundo3);
        }else{
            System.out.println("A diferença de horario é: 0 : 0 : 0");
        }
        sc.close();
    }

}
