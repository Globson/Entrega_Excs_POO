public class Eleitor{
  private static String Titulo;
  private static boolean votou = false;

  public Eleitor(String NTitulo){
    Titulo = NTitulo;
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
