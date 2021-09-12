package AulaPratica;

public class Livro  implements Publicação {
    private String título;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return " O livro é " +
                  título + '\'' +
                ", \n  O autor é " + autor + '\'' +
                ", \n O total de páginas é " + totPaginas +
                ", \n Está na página  " + pagAtual +
                ", \n Quem está lendo é " + leitor.getNome() +
                ", \n Está aberto ? " + aberto + "";
    }

    public Livro(String título, String autor, int totPaginas, Pessoa leitor) {
        this.título = título;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
      this.setAberto(true);
    }

    @Override
    public void fechar() {
    this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
    this.pagAtual = p;
    if(this.aberto == false){
        System.out.println("O livro está fechado");
    }

    }

    @Override
    public void avancarPag() {
    this.pagAtual++;
     if(this.aberto == false){
            System.out.println("O livro está fechado");
        }
     if (pagAtual >= totPaginas && this.aberto == true){
        System.out.println("O livro acabou");
        setPagAtual(300);
    }
    }

    @Override
    public void voltarPag() {
    this.pagAtual--;
        if(this.aberto == false){
            System.out.println("O livro está fechado");
        }
    if(pagAtual < 1 && this.aberto== true){
        System.out.println("O livro já está no início");
    }
    }
}

