package Aula04;

public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;

    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
public void status(){
    System.out.println("Modelo " + this.getModelo());
    System.out.println("Cor: " + this.getCor());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Tampada: " + this.isTampada());
}
}
