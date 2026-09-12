
public enum FaixaEtaria {
    CRIANCA("crianca", "0-12 anos"),
    ADOLESCENTE("adolescente", "13-18 anos"),
    ADULTO("adulto(a)", "+18 anos");

    private String descricao;
    private String entre;

    private FaixaEtaria(String descricao, String entre) {
        this.descricao = descricao;
        this.entre = entre;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEntre() {
        return entre;
    }
}
