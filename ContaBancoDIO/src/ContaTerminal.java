public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero +" e seu saldo R$ " + saldo +
                " já está disponível para saque";
    }
}
