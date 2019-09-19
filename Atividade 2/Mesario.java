import java.util.ArrayList;

public class Mesario{
 public static Urna Urna1;
 private static ArrayList<String> TitulosVotados = new ArrayList();

 public void AutorizarVoto(String Titulo){
   boolean TituloDisponivel = false;
   for(int i=0;i<TitulosVotados.size();i++){
     if(!(TitulosVotados.get(i).equals(Titulo))){
       TituloDisponivel = true;
     }
   }
   if((Titulo.length() == 12 || Titulo.length() == 11) && TituloDisponivel){
     Urna1.AutorizaEleitor();
     TitulosVotados.add(Titulo);
   }
 }
 public static void AbreVotacao(){
   Urna1 = new Urna();
   Urna1.getCanditados();
 }
 public static void FechaVotacao(){
   Urna.getVotos();
 }
}
