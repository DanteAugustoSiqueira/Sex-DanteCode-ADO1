
public class ExecutarLanchonete {
    public static void main(String[] args) throws Exception {
        Cliente cl1 = new Cliente();
        cl1.setNome("Lucas");
        cl1.setFaixaEtaria(FaixaEtaria.ADOLESCENTE);
        cl1.setCategoria(Categoria.DOCE);

        Cliente cl2 = new Cliente();
        cl2.setNome("Fernanda");
        cl2.setFaixaEtaria(FaixaEtaria.ADULTO);
        cl2.setCategoria(Categoria.SALGADO);

        System.out.println(
            "Meu nome: " + 
            cl1.getNome() + 
            ", sou " + 
            cl1.getFaixaEtaria().getDescricao() + 
            "(idade entre " + 
            cl1.getFaixaEtaria().getEntre() + 
            ")" + 
            ", comprei dois doces: 1. " + 
            cl1.getCategoria().getOpcaoPopular() + 
            " e 2. " + 
            cl1.getCategoria().getOutraOpcao()
        );

        System.out.println(
            "Meu nome: " + 
            cl2.getNome() + 
            ", sou " + 
            cl2.getFaixaEtaria().getDescricao() + 
            "(idade entre " + 
            cl2.getFaixaEtaria().getEntre() + 
            ")" + 
            ", comprei dois salgados: 1. " + 
            cl2.getCategoria().getOpcaoPopular() + 
            " e 2. " + 
            cl2.getCategoria().getOutraOpcao()
        );
    }
}
