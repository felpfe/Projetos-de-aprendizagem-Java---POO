package ContaBanco;

public class Conta {
    public int numConta;
    protected String tipo;
    public String dono;
    public int saldo;
    public boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public Conta() {
        saldo = 0;
        status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(int s) {
        this.saldo = s;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            saldo = 50;
        } else if (t == "CP") {
            saldo = 150;
        }

    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(int v) {
        if (status == true) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(int v) {
        if (status == true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }if(this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
             }else{
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

}


