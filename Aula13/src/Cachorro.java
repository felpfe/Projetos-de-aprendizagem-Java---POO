public class Cachorro extends Lobo{

    public void reagir(String frase){
        if(frase == "toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
    if(hora < 12){
        System.out.println("Abanar rabo");
    }else if(hora >= 18){
        System.out.println("ignorar");
    }else{
        System.out.println("Abanar e latir");
    }
    }

    public void reagir(boolean dono){
    if(dono == true){
        System.out.println("Abanar rabo");
    }else{
       this.emitirSom();
    }
    }

    public void reagir(int idade, float peso){
    if(idade < 5 ){
        if(peso < 10){
            System.out.println("Abanar");
        }else{
            System.out.println("Latir");
        }

    }else{
        if(peso < 10){
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorar");
        }
        System.out.println("latir");

    }
    }
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
}
