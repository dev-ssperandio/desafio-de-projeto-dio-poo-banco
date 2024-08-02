public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, String tipoConta, Banco banco) {
        super(cliente, tipoConta, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
