public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cargo, double salario, double bonus) {
        super(nome, cargo, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + getNome() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", salario=" + getSalario() +
                ", bonus=" + bonus +
                '}';
    }
}

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String cargo, double salario, String linguagem) {
        super(nome, cargo, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", salario=" + getSalario() +
                ", linguagem='" + linguagem + '\'' +
                '}';
    }
}
