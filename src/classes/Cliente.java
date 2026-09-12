
package classes;

public class Cliente {
    private String nome;
    private String cpf;
    private FaixaEtaria faixaEtaria;

    private Cliente(String nome, String cpf, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.cpf = cpf;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
