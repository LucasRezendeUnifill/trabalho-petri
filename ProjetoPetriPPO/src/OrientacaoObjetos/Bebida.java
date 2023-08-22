package OrientacaoObjetos;

public class Bebida extends Alimento {
    private boolean gelada;

    public Bebida(String nome, String tipo, String cor, String codigoBarras, int validadeDias, String localArmazenamento, double quantidade, boolean gelada) {
        super(nome, tipo, cor, codigoBarras, validadeDias, localArmazenamento, quantidade);
        this.gelada = gelada;
    }

    // Getter e setter específico da Bebida

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public void abrir() {
        System.out.println("A bebida está sendo aberta.");
    }

    public void servir() {
        System.out.println("A bebida está sendo servida.");
    }

    public void gelar() {
        System.out.println("A bebida está sendo gelada.");
    }
}
