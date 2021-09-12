public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int toAssistindo) {
        this.totAssistido = toAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto é: " + super.toString() +
                "\n login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '.';
    }
}
