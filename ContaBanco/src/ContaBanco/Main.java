package ContaBanco;
/*cc - conta corrente
        cp - conta poupança

        Se abrir uma conta corrente ganha 50 reais e se for
        uma poupança gannha 150 reais.

        Para fechar uma conta não se pode haver dinheiro nela
        e nem estar devendo

        Para sacar dinheiro é necessário que hajá dinheiro
        e o saque não pode ultrapassar o valor nele

        cc mensalidade 12 e cp mensalidade 20
        */


public class Main {
    public static void main(String[] args){
        Conta p1 = new Conta();
        p1.setNumConta(158698);
        p1.setDono("Felipe");
        p1.abrirConta("CC");
        p1.estadoAtual();

    }
}
