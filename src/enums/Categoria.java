
package enums;

public enum Categoria {
    DOCE("chocolate", "baunilha"),
    SALGADO("coxinha", "pao de queijo");

    private String opcaoPopular;
    private String outraOpcao;

    private Categoria(String opcaoPopular, String outraOpcao) {
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
