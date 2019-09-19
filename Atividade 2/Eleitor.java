public class Eleitor{
  private String Titulo;
  private boolean votou = false;

  public Eleitor(String NTitulo){
    Titulo = NTitulo;
  }
  public String get_Titulo(){
    return Titulo;
  }
  public void set_votou(){
    votou = true;
  }
  public boolean get_votou(){
    return votou;
  }
}
