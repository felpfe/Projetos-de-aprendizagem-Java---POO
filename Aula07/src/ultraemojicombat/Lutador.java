package ultraemojicombat;

public class Lutador {

    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.println("CHEGOU A HORA!" + "Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());

    }
    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        if(getVitorias() == 1){
            System.out.println(getEmpates() + "vitória");
        }else{
            System.out.println(getVitorias() + " vitórias");
        }
        System.out.println(getDerrotas() + " derrotas");
        if(getEmpates() == 1){
            System.out.println(getEmpates() + " empate");
            }else{
            System.out.println(getEmpates() + " empates");
        }
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.idade = id;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
       return peso;
    }

    public void setPeso(float peso) {
       this.peso = peso;
       this.setCategoria();
    }


    public String getCategoria() {
        return categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            categoria = "inválido";
        } else if (this.peso <= 70.3) {
            categoria = "leve";
        } else if (this.peso <= 83.9) {
            categoria = "médio";
        } else if (this.peso <= 120.2) {
            categoria = "pesado";
        } else {
            categoria = "inválido";
        }
       }

}

