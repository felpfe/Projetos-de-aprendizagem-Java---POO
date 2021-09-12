package Aula2;
//aula 2- criação de todos os metodos e atributos da classe
//aul a 3- foi passado os controladores de acesso private, public e protected

public class Main {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();

    c1.modelo = "Bic cristal";
    c1.cor = "azul";
   // c1.ponta = 0.5f;
    c1.tampar();
    c1.carga = 80;
   // c1.tampada = false;
    c1.status();
    c1.rabiscar();

  }
}

