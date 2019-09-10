/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author grobs
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Integer> Vetor = new ArrayList<Integer>();
        while(true){
            System.out.print("Entre com um inteiro:");
            char b = sc.next().charAt(0);
            if(b != 'f'){
                 Vetor.add(Character.getNumericValue(b));
             }
             else{
                 break;
            }
        }
        System.out.println("Lista de numeros antes de ordenar:"+Vetor);
        Collections.sort(Vetor);
        System.out.println("Lista de numeros depois de ordenar:"+Vetor);
        sc.close();
    }

}
