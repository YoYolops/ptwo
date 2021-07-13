
/**
* Gerenciador de finanças estudantis. Armazena dinheiro possuído em centavos pelo estudante, além de armazenar 
* registro de depósitos e quantidade de despesas. Todo registro precisa de uma quantidade de registros de ganhos e um
* valor inicial possuído.
*
* @author Yohan Lopes Rodrigues - 118 110 773
*/


public class RegistroFinancas {
    /**
    * Quantidade atualizada possuída pelo estudante (em centavos)
    */
    private int valorPossuido;

    /**
    * Quantidade possuída pelo estudante no momento da criação do objeto (em centavos)
    */
    private int valorInicial;

    /**
    * Array para armazenagem de todos os depósitos realizados (em centavos), como tamanho definido no momento da criação do objeto
    */
    private int[] registroDeGanhos = new int[0];

    /**
    * Soma de todas as despesas do estudante
    */
    private int valorTotalDeDespesas = 0;

    /**
    * Constrói um registro das finanças do estudante a partir de um valor inicial (em centavos) possuído pelo mesmo
    * e de um tamanho fixo para a quantidade de registros de depósito que serão armazenados.
    *
    * @param valorCentavos Valor inicial possuído pelo estudante em centavos.
    * @param quantidadeIndexesDeGanho Quantidade de registros que o array competente deverá armazenar.
    */
    public RegistroFinancas(int valorCentavos, int quantidadeIndexesDeGanho) {
        this.valorPossuido = valorCentavos;
        this.valorInicial = valorCentavos;

        if(this.registroDeGanhos.length < quantidadeIndexesDeGanho) {
            this.registroDeGanhos = new int[quantidadeIndexesDeGanho];
        }
    }

    /**
    * Verifica os registros de depósitos e retorna o valor total recebido
    *
    * @return o inteiro que representa o total recebido por depósitos
    */
    private int calculaValorTotalRecebido() {
        int soma = 0;

        for(int valor : this.registroDeGanhos) {
            soma += valor;
        }
        return soma;
    }

    /**
    * Atualiza e retorna o valor possuído, adicionando os valores adquiridos por depósito
    *
    * @return O valor inteiro da quantidade de dinheiro atualmente possuída (após efetuação de depósitos)
    */
    private int valorPossuidoAposGanhos() {
        int valorAtualizado = this.valorPossuido + this.calculaValorTotalRecebido();

        return valorAtualizado;
    }

    /**
    * Adiciona valores ao registro de depósitos.
    *
    * @param valorCentavos Quantidade, em centavos, a ser adicionada ao registro e depósitos.
    * @param posicaoGanho Em que parte do registro o valor deve ser adicionado.
    * @return void
    */
    public void adicionaGanhos(int valorCentavos, int posicaoGanho) {
        int indexGanho = posicaoGanho - 1;
        registroDeGanhos[indexGanho] = valorCentavos;
    }

    /**
    * Subtrai um débito do valor possuído, e adiciona esse débito à variável que armazena o total de débitos computados
    *
    * @param valorCentavos Valor a ser debitado (em centavos)
    * @return void
    */
    public void pagaDespesa(int valorCentavos) {
        this.valorPossuido -= valorCentavos;
        this.valorTotalDeDespesas += valorCentavos;
    }

    /**
    * Retorna uma string em mútiplas linhas que exibe, em cada linha, um valor de depósito armazenado no registro de ganhos
    * no formato: "1 - 000", onde no lugar do "000" pode vir qualquer numero inteiro, sem delimitação de quantidade e caracteres
    *
    * @return retorna uma string de mútiplas linhas, cada uma representando um registro de ganhos
    */
    public String exibeGanhos() {
        String ganhos = "";

        for(int i = 0; i < this.registroDeGanhos.length; i++) {
            int numeroDeRegistro = i + 1;

            if((i + 1) < this.registroDeGanhos.length) {
                ganhos += numeroDeRegistro + " - " + this.registroDeGanhos[i] + "\n";
            } else {
                ganhos += numeroDeRegistro + " - " + this.registroDeGanhos[i];
            }
        }

        return ganhos;
    }

    /**
    * Gera e retorn uma string que condensa todas as informações armazenadas no objeto. 
    *
    * @return A representação em string de todos os dados armazenado no objeto no formato: Total recebidos: 94100, Despesas totais: 20000, Total disponível: 74100.
    */
    public String toString() {
        int valorTotalRecebido = this.calculaValorTotalRecebido() + this.valorInicial;
        int valorDisponivel = this.valorPossuidoAposGanhos();

        String totalRecebidos = "Total recebidos: " + valorTotalRecebido;
        String despesasTotais = "Despesas totais: " + this.valorTotalDeDespesas;
        String totalDisponivel = "Total disponível: " + valorDisponivel;

        String finalString = totalRecebidos + ", " + despesasTotais + ", " + totalDisponivel;

        return finalString;
    }
}
