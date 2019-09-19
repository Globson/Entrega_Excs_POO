public class Urna{
  private static String Candidatos[]=  {"Joao","Raniere","Samuel","Ferreira","Branco","Nulos"};  //Canditatos
  private static int codigosCanditados[] = {01,02,03,04,00};
  private static int Votos[] = new int[6];
  private static boolean EleitorAutorizado = false;

  public Urna(){
    for(int i = 0;i<6;i++){
      Votos[i] = 0;
    }
  }


  public void AutorizaEleitor(){
    EleitorAutorizado = true;
  }


  public boolean Votar(int Codigo_Canditado){
    boolean voto_valido = false;
    if(EleitorAutorizado){
    for(int i = 0;i<5;i++){
      if(codigosCanditados[i]==Codigo_Canditado){
          Votos[i]++;
          voto_valido = true;
          System.out.println("Voce votou em "+Candidatos[i]);
      }
    }
    if(voto_valido == false){
      Votos[5]++;
      System.out.println("Nenhum canditado com esse nome foi encontrado! Voto anulado!");
    }
    EleitorAutorizado = false;
    return true;
  }
    else{
      System.out.println("Eleitor nao autorizado a votar!");
      EleitorAutorizado = false;
      return false;
    }
  }


  public static void getVotos(){
    for(int i = 0;i<5;i++){
      System.out.println("Nome do canditado: "+Candidatos[i]+" numero de votos: "+Votos[i]);
    }
    System.out.println("Quantidade de votos Nulos: "+Votos[5]);
  }


  public void getCanditados(){
    System.out.println("\t Eleicao inicializada!");
    for(int i = 0;i<5;i++){
      System.out.println("Nome do canditado: "+Candidatos[i]+" codigo para voto: "+codigosCanditados[i]);
    }
    System.out.println("Para anular seu voto basta entrar com um codigo para candidato invalido\n\n");
  }
}
