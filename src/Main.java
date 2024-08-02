//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco");

        Cliente sidney = new Cliente();
        sidney.setNome("Sidney");

        Conta corrente = new ContaCorrente(sidney, "Corrente", banco);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(sidney, "Poupanca", banco);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.imprimirHistoricoTransacoes();

        banco.imprimirContas();

    }
}