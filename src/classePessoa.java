public class classePessoa {

    String atributoNome;
    int atributoIdade;
    float atributoRenda;

    public void metodoImprimir(){
        System.out.println(this.atributoNome);
    }

    public void metodoAlterarRenda(float parametroValorAdicional){
        this.atributoRenda = this.atributoRenda + parametroValorAdicional;
    }

    public float metodoDevolverRenda(){
        return (this.atributoRenda + 1000.00f);
    }
}
