package OrientacaoObjetos;

public class Fruta extends Alimento {
    private boolean doce;
    private boolean comestivelComCasca;

    public Fruta(String nome, String tipo, String cor, String codigoBarras, int validadeDias, String localArmazenamento, double quantidade, boolean doce, boolean comestivelComCasca) {
        super(nome, tipo, cor, codigoBarras, validadeDias, localArmazenamento, quantidade);
        this.doce = doce;
        this.comestivelComCasca = comestivelComCasca;
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }

    public boolean isComestivelComCasca() {
        return comestivelComCasca;
    }

    public void setComestivelComCasca(boolean comestivelComCasca) {
        this.comestivelComCasca = comestivelComCasca;
    }

    public void lavar() {
        System.out.println("A fruta está sendo lavada.");
    }

    public void descascar() {
        System.out.println("A fruta está sendo descascada.");
    }

    public void cortar() {
        System.out.println("A fruta está sendo cortada.");
    }

    public void saborear() {
        System.out.println("A fruta está sendo saboreada.");
    }

    public void verificarCascaComestivel() {
        if (comestivelComCasca) {
            System.out.println("A casca é comestível.");
        } else {
            System.out.println("A casca não é comestível.");
        }
    }
}
