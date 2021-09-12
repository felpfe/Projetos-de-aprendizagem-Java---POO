package AulaPratica;

public class Main {
    public static void main(String [] args){
        Pessoa [] p = new Pessoa [3];
        Livro [] l = new Livro [4];
        p[0] = new Pessoa("Paulo", 22, "m");
        p[1] = new Pessoa("Claudio", 30, "m");
        p[2] = new Pessoa("Paula", 18, "f");

        l[0] = new Livro("aprendendo java", "José da silva", 300, p[0]);
        l[0].abrir();
        System.out.println(l[0].detalhes());


    }
}
