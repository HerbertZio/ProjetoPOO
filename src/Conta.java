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


    public void metodoAlterarNumero (int argumentoNumero){
        this.numero = argumentoNumero;
    }

    public void metodoAlterarSaldo (float argumentoSaldo){
        this.saldo = argumentoSaldo;
    }


    public void metodoAlterarTipo (String argumentoTipo){
        this.tipo = argumentoTipo;
    }

    public void metodoAlterarTudo (int x, float y, String z){
        this.numero = x;
        this.saldo = y;
        this.tipo = z;
    }


}
