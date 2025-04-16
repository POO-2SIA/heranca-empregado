import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado{
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome); //Como já existe a inicialização dessas variáveis na superclasse, o construtor dessa classe
        //Chama um método da superclasse para inicializar aqui também
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    //OBS: Precisamos sobrescrever o método nas subclasses pelo fato dela ser abstrata na superclasse
    public double calcularSalario() {
        return (totalDeVendas * comissao) / 100;
    }

    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas: R$" + df.format(totalDeVendas) + "\n";
        aux += "Comissão: " + df.format(comissao) + "%";
        return aux;
    }
}
