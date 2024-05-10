public class Principal {

    //Metodo onde o programa inicia!
    public static void main(String[] args) {

        Conta conta1 = new Conta();

        conta1.metodoAlterarTudo(1, 5000f, "Conta Poupança");
        conta1.cliente = new Cliente();

        conta1.cliente.nome = "Herbert";
        conta1.cliente.renda = 18_000.00f;
        conta1.cliente.alterarPessoa("Felipe", 8_000.00f);
        conta1.cliente.imprirPessoa();
        conta1.imprimirTodos();

//        -------------------------------------------------

        Conta conta2 = new Conta();
        conta2.metodoAlterarTudo(2, 12000f, "Conta Salário");
        conta2.cliente = new Cliente();
        conta2.cliente.alterarPessoa("Gati", 3_000.00f);
//        --------------------------------------------------

        conta2.depositar(3_000.00f);
        conta2.imprimirTodos();

//        ------------------------------------------------------
        conta2.sacar(20000f);
        conta2.imprimirTodos();

//        --------------------------------------------------------

        conta2.transferencia(200f, conta2, conta1);
        conta2.imprimirTodos();
        conta1.imprimirTodos();

    }

}
