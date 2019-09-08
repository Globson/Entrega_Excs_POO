/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        String Nome_arq = sc.nextLine();
        int num_mulheres=0,faixa_idade=0,quant_H=0,idade_maior=0;
        String Paciente_velho = new String(),Mulher_Baixa = new String();
        int quant=0,idade,peso;
        float tamanho,tamanho_M_baixa=100;
        float soma_idades_H=0,media_idade_H;
        String partes[] = new String[5];
        String nome,sexo;
        try {
            FileReader file = new FileReader(Nome_arq);
            BufferedReader lerArq = new BufferedReader(file);
            String Line = lerArq.readLine(); // le a primeira linha

        while (Line != null) {
            quant++;
            partes = Line.split(";");
            sexo = partes[0];
            idade =Integer.parseInt(partes[1]);
            tamanho =Float.parseFloat(partes[2]);
            peso = Integer.parseInt(partes[3]);
            nome = partes[4];
            if(sexo.equals("H")){
                soma_idades_H = soma_idades_H + idade;
                quant_H++;
            }
            else if(sexo.equals("M") && tamanho<=1.7 && tamanho>=1.6 && peso>70){
                num_mulheres++;
            }

            if(idade >= 18 && idade <= 25 ){
                faixa_idade++;
            }
            if(idade>idade_maior){
                idade_maior = idade;
                Paciente_velho = nome;
            }
            if(sexo.equals(("M")) && tamanho<tamanho_M_baixa){
                tamanho_M_baixa = tamanho;
                Mulher_Baixa = nome;
            }
            Line = lerArq.readLine(); // le da segunda até a última linha
         }
         file.close();
        }catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage()); //exibe erro caso haja problema com leitura de arquivo.
    }
        media_idade_H = soma_idades_H/quant_H;
        System.out.println("Quantidade de pacientes: "+quant);
        System.out.println("Media da idade dos homens: "+media_idade_H+quant_H);
        System.out.println("Numero de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+num_mulheres);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: "+faixa_idade);
        System.out.println("Nome do paciente mais velho: "+Paciente_velho);
        System.out.println("Nome da mulher mais baixa: "+Mulher_Baixa);
        sc.close();
    }

}
