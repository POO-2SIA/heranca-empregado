public class Main {
    public static void main(String[] args) {
        Empregado[] vetor = new Empregado[3];
        vetor[0] = new EmpregadoComissionado(1, "Lucas", 1000, 10);
        vetor[1] = new EmpregadoHorista(2, "Ana", 200, 180);
        vetor[2] = new EmpregadoComissionado(3, "Josh", 100000, 20);

        /*
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].calcularSalario();
        }
        */

        for(Empregado e : vetor) {
            System.out.println(e.getDados());
            System.out.println("Salário: " + e.calcularSalario() + "\n");
        }
    }
}
