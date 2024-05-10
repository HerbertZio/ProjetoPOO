public class Conta {

    int numero;
    float saldo;
    String tipo;
    //Composição
    Cliente cliente;

    //Metodo de impressão de informações de conta
    //Sempre publico, tipo de retorno, nome, parametros.

    public void imprimirNumero() {
        System.out.println("O número da conta é: " + this.numero);
    }

    public void imprimirSaldo() {
        System.out.println("O saldo da conta é: " + this.saldo);
    }

    public void imprimirTipo() {
        System.out.println("O tipo da conta é: " + this.tipo);
    }

    public void imprimirTodos() {
        System.out.println("O número da conta é: " + this.numero);
        System.out.println("O número da conta é: " + this.saldo);
        System.out.println("O número da conta é: " + this.tipo);
    }


    public void metodoAlterarNumero(int argumentoNumero) {
        this.numero = argumentoNumero;
    }

    public void metodoAlterarSaldo(float argumentoSaldo) {
        this.saldo = argumentoSaldo;
    }


    public void metodoAlterarTipo(String argumentoTipo) {
        this.tipo = argumentoTipo;
    }

    public void metodoAlterarTudo(int x, float y, String z) {
        this.numero = x;
        this.saldo = y;
        this.tipo = z;
    }

    void depositar(float valorDepositado) {
        this.saldo = this.saldo + valorDepositado;
//        this.saldo += valorDepositado;
    }

    void sacar(float valorSacado) {

        if (valorSacado <= this.saldo) {
            this.saldo = this.saldo - valorSacado;
        } else {
            System.out.println("Entrou no cheque especial!");
        }
    }

    void transferencia(float valorTransferencia, Conta contaOrigem, Conta contaDestino) {
        if (valorTransferencia <= contaOrigem.saldo) {
            contaOrigem.saldo -= valorTransferencia;
            contaDestino.saldo += valorTransferencia;
            System.out.println("Transferência de " + valorTransferencia + " realizada com sucesso da conta " + contaOrigem.numero + " para a conta " + contaDestino.numero);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

}
