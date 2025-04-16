import java.text.DecimalFormat;

public class Controle {
    final int N = 5;
    private Empregado[] empregados = new Empregado[N];
    private int index = 0;

    public void inserir(Empregado empregado) {
        empregados[index] = empregado;
        index++;
    }

    public Empregado pesquisar(long matricula) {
        for(int i = 0; i < index; i++) {
            if(empregados[i].matricula == matricula) {
                return empregados[i];
            }
        }
        return null;
    }

    public String listar() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += empregados[i].getDados();
            aux += "Salário: R$" + df.format(empregados[i].calcularSalario());
        }
        return aux;
    }
}
