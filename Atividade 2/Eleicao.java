import java.util.Scanner;
public class Eleicao{
  public static void main(String[] args) {
    Mesario Mesario1 = new Mesario();
    Mesario1.ZonaEleitoral = 225; //Zona eleitoral aleatoria
    Mesario1.AbreVotacao();  //Exibe opcoes de votos
    Scanner sc = new Scanner(System.in);
    int breaker = 1;

    while(true){ //Eleitores um a um entram com titulo e votam
    System.out.print("Entre com seu titulo de eleitor(11 ou 12 numeros): ");
    String NTitulo = sc.next();   //ATENCAO titulo tem de 11 a 12 caracteres!!
    System.out.print("Entre com seu nome: ");
    String NomeEleitor = sc.next();
    Eleitor Eleitor1 = new Eleitor(NTitulo,NomeEleitor);
    Mesario1.AutorizarVoto(Eleitor1.get_Titulo());
    System.out.print("Entre com o numero do canditado: ");
    int NCandidato = sc.nextInt();
    Eleitor1.set_votou(Mesario1.Urna1.Votar(NCandidato));
    System.out.print("Outro eleitor ira votar?\n\t1-Sim\n\t0-Nao\nEntre: ");
    breaker = sc.nextInt();
    if(breaker == 0){
      break;
    }}
    Mesario1.FechaVotacao(); //Exibe resultados
    sc.close();
  }
}
