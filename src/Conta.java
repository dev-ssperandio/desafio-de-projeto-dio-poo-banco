import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public abstract class Conta implements IConta{
    protected String tipoConta;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> historicoTransacoes;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, String tipoConta, Banco banco) {
        banco.adicionarConta(this);
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (saldo > 0 && valor <= saldo) {
            this.saldo -= valor;
            Transacao saque = new Transacao("Saque", valor);
            historicoTransacoes.add(saque);
        } else {
            System.out.println("Saldo indisponível para transação!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            Transacao deposito = new Transacao("Depósito", valor);
            historicoTransacoes.add(deposito);
        } else {
            System.out.println("Valor insuficiente para transação!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        Transacao transferencia = new Transacao("Transferência", valor);
        historicoTransacoes.add(transferencia);
    }

    public void imprimirHistoricoTransacoes() {
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Número da Agência: %d%n", this.agencia);
        System.out.printf("Número da Conta: %d%n", this.numeroConta);
        System.out.printf("Saldo da Conta: %.2f%n", this.saldo);
    }

}
