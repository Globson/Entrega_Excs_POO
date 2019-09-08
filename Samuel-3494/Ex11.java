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
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();
        String partes[] = new String[4];
        partes = linha.split(" ");
        float a,b,c;
        if(partes[0].equals("MULTIPLICA")){
        a = Integer.parseInt(partes[1]);
        b = Integer.parseInt(partes[3]);
        c = a*b;
        System.out.println("RESPOSTA: "+c);
        }
        else if(partes[0].equals("DIVIDE")){
        a = Integer.parseInt(partes[1]);
        b = Integer.parseInt(partes[3]);
        c = a/b;
        System.out.println("RESPOSTA: "+c);
        }
        else if(partes[0].equals("SOMA")){
        a = Integer.parseInt(partes[1]);
        b = Integer.parseInt(partes[3]);
        c = a+b;
        System.out.println("RESPOSTA: "+c);
        }
        else if(partes[0].equals("SUBTRAI")){
        a = Integer.parseInt(partes[1]);
        b = Integer.parseInt(partes[3]);
        c = b-a;
        System.out.println("RESPOSTA: "+c);
        }
        sc.close();

    }

}
