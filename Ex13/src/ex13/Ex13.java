/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author grobs
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Informe o nome de arquivo texto:");
        String nome = sc.nextLine();
 
        System.out.print("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
 
            String linha = lerArq.readLine(); // lê a primeira linha
    // a variável "linha" recebe o valor "null" quando o processo
    // de repetição atingir o final do arquivo texto
        while (linha != null) {
            System.out.printf("%s\n", linha);
        
             linha = lerArq.readLine(); // lê da segunda até a última linha
         }
 
         arq.close();
        }catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
    }
 
    System.out.println();
    }
    
}
