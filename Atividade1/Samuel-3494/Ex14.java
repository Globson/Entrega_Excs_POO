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
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float total = 100;
        float totalv = 50;
        double preco = 50;
        float o,v,f;
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEntre com todas as ligacoes uma a uma a seguir:\n\n");
        char tipoL;
        while(true){
            System.out.print("Entre com o tipo de ligacao: ");
            tipoL=sc.next().charAt(0);

            if(tipoL=='o'){
                System.out.print("Entre com a quantidade de minutos: ");
                o = sc.nextInt();
                total = total - o;
                if(total <=0){
                    preco = preco + (o*0.65);
                }}


            else if(tipoL=='v'){
                System.out.print("Entre com a quantidade de minutos: ");
                v = sc.nextInt();
                if(totalv==0){
                    total = total - v;
                }
                else{
                    totalv = totalv - v;
                    if(totalv<0){
                    total = total+totalv;
                    }
                }

                if(total<=0){
                    preco = preco + (v*0.20);
                }
            }

            else if(tipoL=='f'){
                System.out.print("Entre com a quantidade de minutos: ");
                f =sc.nextInt();
                total = total - f;
                if(total <=0){
                    preco = preco + (f*0.65);
                }

            }
            System.out.print("Deseja entrar com mais ligacoes efetuadas? \n\t 1-Sim \n\t 0-Nao\nEntre: ");
            aux = sc.nextInt();
            if(aux == 0){break;}
        }
        if(total<0){total=0;}
        if(totalv<0){totalv=0;}
        System.out.print("O total de minutos restantes é "+total+"\nO total de minutos de bonus restante é de: "+totalv+"\nO valor total da conta é "+preco+" Reais.\n");
        sc.close();
    }

}
