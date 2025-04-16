public abstract class Empregado { //O abstract impede a instanciação de um objeto do tipo dessa classe
    //Essa superclasse só serve para distrbuir sesu atributos e métodos
    //O abstract impede a utilização do new seguido do Construtor
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario(); //O abstract também faz com que não precisemos criar um bloco de
    //código para os métodos.
    //Nós queremos que os métodos possuam calculos diferentes em cada subclasse, portanto vamos sobrescrever esse método
    //nas subclasses

    //OBS: Método abstrato só pode ser criado em classe abstrata

    public String getDados() {
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Matrícula: " + matricula + "\n";
        return aux;
    }
}
