public class Eleitor{
  private static String Nome;
  private static String Titulo;
  private static boolean votou = false;

  public Eleitor(String NTitulo,String Nome1){
    Titulo = NTitulo;
    Nome = Nome1;
  }
  public String get_Nome(){
    return Nome;
  }
  public String get_Titulo(){
    return Titulo;
  }
  public void set_votou(boolean Voto){
    votou = Voto;
  }
  public boolean get_votou(){
    return votou;
  }
}
