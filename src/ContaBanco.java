public class ContaBanco {
    int numero;
    String agencia;
    String nomeCliente;
    Double saldo;

    public ContaBanco(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return """
                Olá %s,
                obrigado por criar uma conta em nosso banco,
                sua agência é %s e conta %d
                seu saldo %.2f já está disponível para saque""".formatted(this.nomeCliente,
                        this.agencia,
                        this.numero,
                        this.saldo);
    }

    public ContaBanco() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
