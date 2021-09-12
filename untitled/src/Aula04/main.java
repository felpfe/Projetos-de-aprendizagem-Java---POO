package Aula04;

public class main {
    public static void main (String[] args){
        Caneta c1 = new Caneta("nic", "amarelo", 0.4f);

        Caneta c2 = new Caneta("bic", "roxa", 1.4f);
       c1.status();
        System.out.println(" ");
       c2.status();

    }
}
