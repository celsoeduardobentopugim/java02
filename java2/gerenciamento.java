import java.util.ArrayList;
import java.util.List;

public class SistemaDeGestao {
    private List<Funcionario> funcionarios;

    public SistemaDeGestao() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado: " + funcionario);
    }

    public void atualizarFuncionario(int index, Funcionario funcionario) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.set(index, funcionario);
            System.out.println("Funcionário atualizado: " + funcionario);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void removerFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            Funcionario removido = funcionarios.remove(index);
            System.out.println("Funcionário removido: " + removido);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        SistemaDeGestao sistema = new SistemaDeGestao();

        Funcionario f1 = new Funcionario("Alice", "Administrativo", 3000.0);
        Gerente g1 = new Gerente("Bob", "Gerente de TI", 8000.0, 1500.0);
        Programador p1 = new Programador("Charlie", "Desenvolvedor", 5000.0, "Java");

        sistema.adicionarFuncionario(f1);
        sistema.adicionarFuncionario(g1);
        sistema.adicionarFuncionario(p1);

        System.out.println("\nLista de Funcionários:");
        sistema.listarFuncionarios();

        System.out.println("\nAtualizando Funcionário:");
        sistema.atualizarFuncionario(1, new Gerente("Bob", "Gerente de TI", 8500.0, 1600.0));
        sistema.listarFuncionarios();

        System.out.println("\nRemovendo Funcionário:");
        sistema.removerFuncionario(0);
        sistema.listarFuncionarios();
    }
}
