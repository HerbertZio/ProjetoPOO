public class Principal {

    //Metodo onde o programa inicia!
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.metodoAlterarTudo(32, 10_000.00f, "Conta Corrente");
        conta2.metodoAlterarTudo(7, 1_500.00f, "Conta Salário");

        conta1.imprimirNumero();
        conta2.imprimirNumero();

        conta1.metodoAlterarSaldo(20_000.00f);

        conta1.imprimirTodos();

        conta1.cliente = new Cliente();
        conta1.cliente.atributoNome = "Jackson";
        conta1.cliente.atributoRenda = 3_000.00f;
        conta1.cliente.atributoChequeEspecial = true;

        Cliente cliente1 = new Cliente();
        cliente1.atributoNome = "João";
        cliente1.atributoRenda = 5_000f;


    }
}
