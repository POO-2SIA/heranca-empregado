import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDeHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDeHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDeHoraTrabalhada = valorDeHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDeHoraTrabalhada;
    }

    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: " + totalDeHorasTrabalhadas + "\n";
        aux += "Valor da hora: R$" + df.format(valorDeHoraTrabalhada);
        return aux;
    }
}
