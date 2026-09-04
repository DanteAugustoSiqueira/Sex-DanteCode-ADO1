
public enum Categorias {
    DOCE("chocolate", "baunilha"),
    SALGADO("coxinha", "pao de queijo");

    private String opcaoPopular;
    private String outraOpcao;

    private Categorias() {}

    private Categorias(String opcaoPopular, String outraOpcao) {
        this.opcaoPopular = opcaoPopular;
        this.outraOpcao = outraOpcao;
    }

    public String getOpcaoPopular() {
        return opcaoPopular;
    }

    public String getOutraOpcao() {
        return outraOpcao;
    }
}
