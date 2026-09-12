
public class VetorLanchonete {
    public String[] lanches;
    public int tamanho;

    // Método construtor: Define como a classe se constroe.
    public VetorLanchonete(int capacidade) {
        this.lanches = new String[capacidade];
        this.tamanho = 0;
    }

    public void addLanche(String lanche) throws Exception {
        this.plusCapacidade();
        this.lanches[this.tamanho] = lanche;
        this.tamanho++;
    }

    public int qtdaLanches() {
        return this.tamanho;
    }

    public void plusCapacidade() {
        if(this.tamanho == this.lanches.length) {
            String[] newLanches = new String[this.lanches.length * 2];
            for(int i = 0; i < lanches.length; i++){
                newLanches[i] = this.lanches[i];
            }

            this.lanches = newLanches;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        // Pega o primeiro valor do vetor lanches[] até o penúltimo valor do vetor para colocar em cada um o ", ".
        for(int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.lanches[i]);
            sb.append(", ");
        }
        
        // Pega o último valor do vetor lanches[].
        if(this.tamanho > 0) {
            sb.append(this.lanches[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public String buscaValor(int indice) throws Exception {
        if(indice >= 0 && indice < tamanho) {
            return this.lanches[indice];
        }
        else {
            throw new Exception("Valor de indice invalido.");
        }
    }

    public int buscaIndice(String lanche) {
        for(int i = 0; i < tamanho; i++) {
            if(lanches[i].equals(lanche)) {
                return i;
            }
        }

        return -1;
    }

    public boolean adicionaInicio(int indice, String lanche) throws Exception {
        this.plusCapacidade();
        if (indice >= 0 && indice < tamanho) {
            for (int i = this.tamanho - 1; i > indice; i--) {
                this.lanches[i + 1] = this.lanches[i];
            }
            this.lanches[indice] = lanche;
            this.tamanho++;
        }
        else {
            throw new Exception("Indice Invalido!");
        }

        return true;
    }
}
