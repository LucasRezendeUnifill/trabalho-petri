package OrientacaoObjetos;

public class Alimento {
    private String nome;
    private String tipo;
    private String cor;
    private String codigoBarras;
    private int validadeDias;
    private String localArmazenamento;
    private double quantidade;

    public Alimento() {

    }

    public Alimento(String nome, String tipo, String cor, String codigoBarras, int validadeDias, String localArmazenamento, double quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.codigoBarras = codigoBarras;
        this.validadeDias = validadeDias;
        this.localArmazenamento = localArmazenamento;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getValidadeDias() {
        return validadeDias;
    }

    public void setValidadeDias(int validadeDias) {
        this.validadeDias = validadeDias;
    }

    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Código de Barras: " + this.codigoBarras);
        System.out.println("Validade em dias: " + this.validadeDias);
        System.out.println("Local de Armazenamento: " + this.localArmazenamento);
    }

    public void abrirEmbalagem() {
        System.out.println("A embalagem foi aberta.");
    }

    public void fecharEmbalagem() {
        System.out.println("A embalagem foi fechada.");
    }

    public void aquecer() {
        System.out.println("O alimento está sendo aquecido.");
    }

    public void consumir() {
        System.out.println("O alimento está sendo consumido.");
    }

    public void armazenar() {
        System.out.println("O alimento está sendo armazenado.");
    }
}
