package ControleRemoto;

public class ControleRemoto implements Controlador {
    //Atributos da classe

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodos especiais

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;

    }

/*
Override- sobscrever -> ocorreu por importar os
 metodos abstratos de outra classe
 */

    @Override
    public void ligar() {
        this.setLigado(true);
        if(this.getLigado() == true){
            System.out.println("A tv está ligando.....");
            System.out.println(" ....10%....");
            System.out.println(" ");
            System.out.println(" ....25%....");
            System.out.println(" ");
            System.out.println(" ....50%....");
            System.out.println(" ");
            System.out.println(" ....75%....");
            System.out.println(" ");
            System.out.println("....100%....");
            System.out.println(" ");
            System.out.println("Olá Felipe");
            System.out.println("Reproduzindo Globo");
        }
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
       //Só mostra o menu caso a TV esteja ligada
        if(this.getLigado() == true){
            System.out.println("-------- MENU --------");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("|");
        }

        }else{
            System.out.println("Impossível mostrar o menu");
        }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        //Só aumenta o volume caso a TV esteja ligada
    if(this.getLigado()){
        this.setVolume(this.getVolume() + 5);
    }else{
        System.out.println("Impossível aumentar o volume");
    }
    }

    @Override
    public void menosVolume() {
        //Só diminui o volume caso a TV esteja ligada
    if (this.getLigado()){
        this.setVolume(this.getVolume() - 5);
    }else{
        System.out.println("Impossível diminuir volume");
    }
    }

    @Override
    public void ligarMudo() {
        //Só liga o mudo caso a TV esteja ligada e o volume estar maior que 0
    if(this.getLigado() && this.getVolume() > 0) {
        this.setVolume(0);
    }
    }

    @Override
    public void desligarMudo() {
        //Só liga o mudo caso a TV esteja ligada e o volume estar igual a 0
    if(this.getLigado() && this.getVolume() == 0){
    this.setVolume(50);
}
    }

    @Override
    public void play() {
        //Só da play se estiver ligado e não estiver tocando
    if(this.getLigado() && !(this.getTocando())){
        this.setTocando(true);
    }else{
        System.out.println("Não consegui reproduzir");
    }
    }

    @Override
    public void pause() {
        //Só da pause se estiver ligando e tocando
    if(this.getLigado() && this.getTocando()){
        this.setTocando(false);
    }else{
        System.out.println("Não consegui pausar");
    }
    }
}
