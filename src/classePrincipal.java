public class classePrincipal {
    public static void main(String[] args) {

        classePessoa objeto_pessoa_1 = new classePessoa();

        System.out.println(objeto_pessoa_1.atributoNome);
        System.out.println(objeto_pessoa_1.atributoIdade);
        System.out.println(objeto_pessoa_1.atributoRenda);

        objeto_pessoa_1.atributoNome = "Herbert";

        System.out.println(objeto_pessoa_1.atributoNome);

        objeto_pessoa_1.metodoImprimir();

        objeto_pessoa_1.metodoAlterarRenda(1_400.00F);

        System.out.println(objeto_pessoa_1.atributoRenda);

        objeto_pessoa_1.metodoAlterarRenda(2_400.00F);

        System.out.println(objeto_pessoa_1.atributoRenda);

        float salario = objeto_pessoa_1.metodoDevolverRenda();

        System.out.println(salario);
    }
}