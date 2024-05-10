abstract public class Pessoa {

    protected String nome; // null
    protected float renda; // 0.00

    void alterarPessoa (String nome, float renda){
        this.nome = nome;
        this.renda = renda;
    }

    void imprirPessoa(){
        System.out.println(this.nome);
        System.out.println(this.renda);
    }

}
