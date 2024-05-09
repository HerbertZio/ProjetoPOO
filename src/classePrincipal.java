public class ClassePrincipal {

    //Metodo onde o programa inicia!
    public static void main(String[] args) {
        ClassePessoa objeto_pessoa_1 = new ClassePessoa();

        objeto_pessoa_1.atributoNome = "Marcio";

        objeto_pessoa_1.metodoImprimir();

        objeto_pessoa_1.metodoAlterarRenda(1400.00F);
        System.out.println(objeto_pessoa_1.atributoRenda);

        objeto_pessoa_1.metodoAlterarRenda(2400.00F);
        System.out.println(objeto_pessoa_1.atributoRenda);

        float salario = objeto_pessoa_1.metodoDevolverRenda();

        System.out.println(salario);


    }
}
