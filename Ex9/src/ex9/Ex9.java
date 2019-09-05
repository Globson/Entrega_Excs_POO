/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a quantidade de numeros:");
        int n = sc.nextInt();
        int numeros[] = new int[n];
        int soma = 0,qpar = 0,qimpar = 0,media,menor,maior;
        for(int i = 0;i<n;i++){
            System.out.print("Entre com um numero:");
            numeros[i] = sc.nextInt();
        }
        menor = numeros[0];
        maior = numeros[0]; //definindo valor inicial como maior e menor;
        for(int j = 0;j<n;j++){
            soma = soma + numeros[j];
            if(numeros[j] > maior){
            maior = numeros[j];}
            if(numeros[j] < menor){
            menor = numeros[j];}
            if(numeros[j]%2 == 0){
            qpar++;}
            else{qimpar++;}
        }
        media = soma/n;
        System.out.println("\nMedia "+media+"\nMaior: "+maior+"\nMenor: "+menor+"\nQuantidade de pares: "+qpar+"\nQuantidade de impares: "+qimpar);
    }
    
}
