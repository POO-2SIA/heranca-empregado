import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
public class Util {
Controle controle = new Controle();

        public void menuPrincipal() {
            int op = 0;
            do {
                String aux = "";
                aux += "-----MENU PRINCIPAL-----\n";
                aux += "Escolha uma opção:\n1. Inserir\n2. Pesquisar\n3. Listar\n4. Sair";
                op = parseInt(showInputDialog(aux));
                if (op < 1 || op > 4) {
                    showMessageDialog(null, "Opção inválida!");
                }

                switch (op) {
                    case 1:
                        inserir();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                        break;
                }
            } while (op != 4);
            showMessageDialog(null, "Atendimento finalizado!");
        }

        private void inserir() {
            int op = parseInt(showInputDialog("Qual funcionário você deseja inserir?" +
                    "\n1. Empregado comissionado\n2. Empregado horista"));

            if (op != 1 && op != 2) {
                showMessageDialog(null, "Opção inválida!");
                return;
            }

            long matricula = parseLong(showInputDialog("Insira o número da matricula do empregado"));
            String nome = showInputDialog("Insira o nome do funcionário");

            if (op == 1) {
                double totalVendas, comissao;
                totalVendas = parseDouble(showInputDialog("Insira o total de vendas do funcionário"));
                comissao = parseDouble(showInputDialog("Insira o valor da comissão do funcionário"));
                EmpregadoComissionado ec = new EmpregadoComissionado(matricula, nome, totalVendas, comissao);
                controle.inserir(ec);
            } else {
                int totalDeHoras = parseInt(showInputDialog("Insira o total de horas trabalhadas"));
                double valorDaHora = parseDouble(showInputDialog("Insira o valor da hora trabalhada"));
                EmpregadoHorista eh = new EmpregadoHorista(matricula, nome, totalDeHoras, valorDaHora);
                controle.inserir(eh);
            }
        }

        private void pesquisar() {
            long matricula = parseLong(showInputDialog("Insira a matricula de quem deseja buscar: "));
            Empregado empregado = controle.pesquisar(matricula);
            if (empregado == null) {
                showMessageDialog(null, "O empregado não foi localizado!");
            } else {
                showMessageDialog(null, empregado.getDados());
            }
        }

        private void listar() {
            showMessageDialog(null, controle.listar());
        }
}
