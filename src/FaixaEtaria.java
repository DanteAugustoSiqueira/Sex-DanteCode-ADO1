
public enum FaixaEtaria {
    CRIANCA("crianca", "0-12"),
    ADOLESCENTE("adolescente", "13-18"),
    ADULTO("adulto", "+18");

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
