
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
            "Meu nome é: " + 
            cl1.getNome() + 
            ", sou " + 
            cl1.getFaixaEtaria().getDescricao() + 
            " (" + 
            cl1.getFaixaEtaria().getEntre() + 
            ")" + 
            ", e comprei dois doces: 1. " + 
            cl1.getCategoria().getOpcaoPopular() + 
            " e 2. " + 
            cl1.getCategoria().getOutraOpcao() +
            "."
        );

        System.out.println(
            "Meu nome é: " + 
            cl2.getNome() + 
            ", sou " + 
            cl2.getFaixaEtaria().getDescricao() + 
            " (" + 
            cl2.getFaixaEtaria().getEntre() + 
            ")" + 
            ", e comprei dois salgados: 1. " + 
            cl2.getCategoria().getOpcaoPopular() + 
            " e 2. " + 
            cl2.getCategoria().getOutraOpcao() +
            "."
        );

        VetorLanchonete vetor = new VetorLanchonete(2);

        vetor.addLanche("Coxinha");
        vetor.addLanche("Pao de queijo");
        vetor.addLanche("Esfiha de calabresa");

        System.out.println("Busca lanche: " + vetor.buscaValor(0));

        System.out.println("Busca indice: " + vetor.buscaIndice("Pao de queijo"));

        System.out.println("Quantidade de dados no vetor: " + vetor.adicionaInicio(1, "Croassaint"));

        System.out.println("Quantidade de dados no vetor: " + vetor.qtdaLanches());

        System.out.println("Dados do vetor: " + vetor.toString());
    }
}
