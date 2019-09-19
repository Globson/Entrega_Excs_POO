import java.util.ArrayList;

public class Mesario{
 public int ZonaEleitoral;
 public Urna Urna1;
 private static ArrayList<String> TitulosVotados = new ArrayList<String>();
 private boolean FirstVote = true;

 public void AutorizarVoto(String Titulo){
   boolean TituloDisponivel = false;

   if(FirstVote){
     TituloDisponivel = true;
     FirstVote = false;
   }

   for(int i=0;i<TitulosVotados.size();i++){
     if(!((TitulosVotados.get(i)).equals(Titulo))){   //Apenas autoriza o voto se titulo nao se repete entre as tentativas de voto.
       TituloDisponivel = true;     }
   }

   if((Titulo.length() == 12 || Titulo.length() == 11) && TituloDisponivel){
     Urna1.AutorizaEleitor();
     TitulosVotados.add(Titulo);

   }
 }

 public void AbreVotacao(){
   Urna1 = new Urna();
   Urna1.getCanditados();
 }

 public void FechaVotacao(){
   Urna.getVotos();
 }
}
