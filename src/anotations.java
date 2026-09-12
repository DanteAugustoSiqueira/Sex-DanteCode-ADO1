
// // ADO 01
// // ▹Desenvolver uma aplicação utilizando a linguagem JAVA e os conceitos da Aula 02 e Aula 03, sobre Array e manipulação de dados.

// // ▹Descrever a situação e/ou problema (tema livre);

// // ▹Criar uma Classe Vetor com todos os métodos para manipular os dados;

// // ▹Criar uma Classe (que terá a lista de atributos ou informações para atender a situação / e/ou problema - 
// // Exemplo na aula 03 - classe contato) com todos os métodos para manipular os dados;

// // ▹Criar uma Classe para testar a aplicação, possibilitando a interação com o usuário, 
// // para manipular os dados permitindo as opções para (Incluir, pesquisar, alterar e excluir os dados armazenados no vetor;

// // Observações:
// // * Enviar a descrição da situação e/ou problema e os códigos das classes utilizadas para a solução em um arquivo no formato .PDF.
// // * Enviar as classes no formato .java (se necessário pode ser em arquivo compactado).
// // * NÃO É PERMITIDO UTILIZAR A API ARRAYLIST

// // Código da Classe Vetor:

// // package projeto_revisao_ed;
// import java.util.Arrays;

// public class Vetor {
//     public String[] elementos;
//     public int tamanho;

//     public Vetor(int capacidade) {
//         this.elementos = new String[capacidade];
//         this.tamanho = 0;
//     }

//     public void adiciona(String elemento) throws Exception {
//         this.aumentaCapacidade();
//         this.elementos[this.tamanho] = elemento;
//         this.tamanho++;        
//     }

//     public int tamanho() {
//         return this.tamanho;
//     }

//     @Override
//     public String toString() {
//         StringBuilder s = new StringBuilder();
//         s.append("[");
//         // Pega o primeiro valor do vetor até o penúltimo valor do vetor
//         for (int i = 0; i < this.tamanho - 1; i++) {
//             s.append(this.elementos[i]);
//             s.append(", ");
//         }
//         // Pega o último valor do vetor
//         if (this.tamanho > 0) {
//             s.append(this.elementos[this.tamanho - 1]);
//         }
//         s.append("]");
//         return s.toString();
//     }

//     public String busca(int posicao) throws Exception {
//         if (posicao >= 0 && posicao < tamanho) {
//             return this.elementos[posicao];
//         }
//         else {
//             throw new Exception("Posicao Invalida!");
//         }
//     }

//     public int busca1(String elemento) {
//         for (int i = 0; i < tamanho; i++) {
//             if (elementos[i].equals(elemento)) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public boolean adiconaInicio(int posicao, String elemento) throws Exception {
//         this.aumentaCapacidade();
//         if (posicao >= 0 && posicao < tamanho) {
//             for (int i = this.tamanho - 1; i > posicao; i--) {
//                 this.elementos[i + 1] = this.elementos[i];
//             }
//             this.elementos[posicao] = elemento;
//             this.tamanho++;
//         }
//         else {
//             throw new Exception("Posicao Invalida!");
//         }
//         return true;
//     }
    
//     public void aumentaCapacidade(){
//         if(this.tamanho == this.elementos.length){
//             String[] elementosNovos = new String[this.elementos.length * 2];
//             for (int i=0; i<elementos.length; i++) {
//                 elementosNovos[i] = this.elementos[i];
//             }
//             this.elementos = elementosNovos;
//         }
//     }
// }

// // Código da Classe Projeto_Revisao_ED

// // package projeto_revisao_ed;

// public class Projeto_Revisao_ED {
//     public static void main(String[] args)throws Exception{
//         Vetor vetor = new Vetor(5);
        
//         vetor.adiciona("elemento 1");
//         vetor.adiciona("elemento 2");
        
//         System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());        
//         System.out.println("Dados do vetor: " + vetor.toString());
//     }   
// }
