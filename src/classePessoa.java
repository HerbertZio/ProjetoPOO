public class ClassePessoa {
    String atributoNome; // null
    int atributoIdade; // 0
    float atributoRenda; // 0.00

    public void metodoImprimir() {
        System.out.println(this.atributoNome);
    }
    //Metodo com parâmetro (argumento)
    public void  metodoAlterarRenda(float parametroValorAdicional){
        this.atributoRenda = this.atributoRenda + parametroValorAdicional;
        // this.atributoRenda += parametroValorAdicional;
    }
    public float metodoDevolverRenda(){

        return (this.atributoRenda + 1000.00f);
    }
}