package OrientacaoObjetos;

public class Pao extends Alimento {
    private boolean integral;

    public Pao(String nome, String tipo, String cor, String codigoBarras, int validadeDias, String localArmazenamento, double quantidade, boolean integral) {
        super(nome, tipo, cor, codigoBarras, validadeDias, localArmazenamento, quantidade);
        this.integral = integral;
    }

    public boolean isIntegral() {
        return integral;
    }

    public void setIntegral(boolean integral) {
        this.integral = integral;
    }

    public void torrar() {
        System.out.println("O pão está sendo torrado.");
    }

    public void passarManteiga() {
        System.out.println("Manteiga está sendo passada no pão.");
    }

    public void rechear() {
        System.out.println("O pão está sendo recheado.");
    }
}
