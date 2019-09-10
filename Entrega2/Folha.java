import java.util.Scanner;
/**
 * @author grobs
 */

public class Folha {

  public static class Funcionario{
    private String Nome;
    private String Nascimento;
    private boolean tipoContrato;  //true para efetivo e false para horista.//
    private double valorSalario;
    private int numeroFilhosMenores;
    private String dataAdmissao;

    public Funcionario(String nome,String nascimento){
      Nome = nome;
      Nascimento = nascimento;
    }

    public void contratar(boolean TContrato,double salario,int filhos,String data_Adm){
      tipoContrato = TContrato;
      valorSalario = salario;
      numeroFilhosMenores = filhos;
      dataAdmissao = data_Adm;
    }

    public void get_Nome_Nascimento(){
      System.out.println("Nome do funcionario: "+Nome);
      System.out.println("Data de nascimento do funcionario: "+Nascimento);
    }

    public void set_tipoContrato(boolean TContrato){
      tipoContrato = TContrato;
    }

    public void get_tipoContrato(){
      if(tipoContrato){
        System.out.println("Funcionario Efetivo!");
      }
      else{
        System.out.println("Funcionario Horista!");
      }
    }

    public void set_valorSalario(double salario){
      valorSalario = salario;
    }

    public void get_valorSalario(){
      if(tipoContrato){
        System.out.println("O valor do salario do funcionario é de: "+valorSalario);
      }
      else{
        System.out.println("O valor do salario do funcionario é de: "+valorSalario+" por hora.");
      }

    }

    public void set_numeroFilhosMenores(int filhos){
      numeroFilhosMenores = filhos;
    }

    public void get_numeroFilhosMenores(){
      System.out.println("A quantidade de filhos menores de idade do funcionario é: "+numeroFilhosMenores);
    }

    public void set_dataAdmissao(String data_Adm){
      dataAdmissao = data_Adm;
    }

    public void get_dataAdmissao(){
      System.out.println("A data de admissao do funcionario é:"+dataAdmissao);
    }

    public double Calcula_salarioBruto(int horas){ //passar horas = 0 caso funcionario seja efetivo, != 0 caso seja horista.//
      if(tipoContrato){
        //System.out.println("O funcionario é efetivo, logo seu salario é de: "+valorSalario);
        return valorSalario;
      }
      else{
        double salarioBruto = valorSalario * horas;
        //System.out.println("O funcionario é horista, logo seu salario de acordo com as horas trabalhadas é de: "+salarioBruto);
        return salarioBruto;
      }
    }


    public double INSS(int horas){ //passar horas = 0 caso funcionario seja efetivo, != 0 caso seja horista.//
      double salarioBruto = Calcula_salarioBruto(horas);
      if(salarioBruto<=1659.38 && salarioBruto>=0){
        double inss = salarioBruto * 0.08;
        return inss;
      }
      else if(salarioBruto<=2765.33 && salarioBruto>=0){
        double inss = salarioBruto * 0.09;
        return inss;
      }
      else if(salarioBruto>2765.33){  //para qualquer valor maior é calculado 11%.//
        double inss = salarioBruto * 0.11;
        return inss;
      }
      else{
        return 0; //para entradas invalidas de salario;
      }
    }

    public double ImpostoRenda(int horas){ //passar horas = 0 caso funcionario seja efetivo, != 0 caso seja horista.//
      double salarioBruto = Calcula_salarioBruto(horas);
      if(salarioBruto<=1903.98 && salarioBruto>=0){
        return 0;
      }
      else if(salarioBruto>=1903.99 && salarioBruto<=2826.65){
        double IRenda = salarioBruto * 0.075;
        return IRenda;
      }
      else if(salarioBruto<=3751.06 && salarioBruto>=2826.66){
        double IRenda = salarioBruto * 0.15;
        return IRenda;
      }
      else if(salarioBruto>=3751.07 && salarioBruto<=4664.68){
        double IRenda = salarioBruto * 0.225;
        return IRenda;
      }
      else if(salarioBruto>4664.68){
        double IRenda = salarioBruto * 0.275;
        return IRenda;
      }
      else{
        return 0; //entrada invalida de salario;
      }
    }

    public double salarioLiquido(int horas){ //passar horas = 0 caso funcionario seja efetivo, != 0 caso seja horista.//
      double salario_Liquido = Calcula_salarioBruto(horas) - INSS(horas) - ImpostoRenda(horas);
      return salario_Liquido;
    }

    public void get_folhaPagamento(int horas){  //passar horas = 0 caso funcionario seja efetivo, != 0 caso seja horista.//
      double salario_liquido = salarioLiquido(horas);
      double salarioBruto = Calcula_salarioBruto(horas);
      double IRenda = ImpostoRenda(horas);
      double inss = INSS(horas);
      System.out.println("\tINICIO DE FOLHA DE PAGAMENTO");
      System.out.println("Nome de funcionario: "+Nome);
      System.out.println("Data de Nascimento: "+Nascimento);
      if(tipoContrato){
        System.out.println("Tipo de contrato: Efetivo");
      }
      else{
        System.out.println("Tipo de contrato: Horista, horas trabalhadas: "+horas);
      }
      System.out.println("Valor do salario bruto: "+salarioBruto);
      System.out.println("Valor do salario liquido: "+salario_liquido);
      System.out.println("Valor do desconto de imposto de renda: "+IRenda);
      System.out.println("Valor do desconto do INSS: "+inss);
      System.out.println("\tFIM DE FOLHA DE PAGAMENTO");
    }


  }


    public static void main(String[] args) {
       Funcionario func1 = new Funcionario("Samuel","02/07/1999");
       func1.contratar(true, 1800, 2, "04/04/2018");
       func1.get_Nome_Nascimento();
       func1.get_valorSalario();
       func1.get_numeroFilhosMenores();
       func1.get_tipoContrato();
       func1.get_dataAdmissao();
       func1.get_folhaPagamento(0); //0 porque funcionario é efetivo./
       Funcionario func2 = new Funcionario("Pedro","14/10/1971");
       func2.contratar(false, 50, 3, "29/07/2011");
       func2.get_Nome_Nascimento();
       func2.get_valorSalario();
       func2.get_numeroFilhosMenores();
       func2.get_tipoContrato();
       func2.get_dataAdmissao();
       func2.get_folhaPagamento(180); //diferente de 0 porque funcionario é horista.//
    }

}
