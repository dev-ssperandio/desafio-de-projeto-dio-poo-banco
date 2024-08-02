public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, String tipoConta, Banco banco) {
        super(cliente, tipoConta, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }
}

