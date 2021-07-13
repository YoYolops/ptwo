
/**
* Representa uma disciplina em curso. Toda disciplina precisa ter um nome, que a identifica. A classe gerencia
* as notas do estudante e permite auditá-las.
* 
* @author Yohan Lopes Rodrigues - 118 110 773
*/

public class Disciplina {
    /**
    * Array que armazena, respectivamente, a primeira, segunda, terceira e quarta nota do estudante.
    */
    private double[] notas = new double[4];

    /**
    * Nome da disciplina.
    */
    private String nome;

    /**
    * Quantidade de horas empenhadas no estudo da disciplina.
    */
    private int horasDeEstudo = 0;

    /**
    * Constrói uma Disciplina a partir de um nome fornecido para identificá-la
    *
    * @param nomeDisciplina Nome da disciplina a ser criada
    */
    public Disciplina(String nomeDisciplina) {
        this.nome = nomeDisciplina;
    }

    /**
    * Calcula e retorna a média das notas do estudante
    *
    * @return retorna um double da média aritmética das quatro notas do estudante
    */
    private double calculaMedia() {
        double somaDasNotas = 0;

        for(double nota : notas) {
            somaDasNotas += nota;
        }

        double media = somaDasNotas / 4;
        return media;
    }

    /**
    * Verifica, baseado nas notas, se o estudante está aprovado ou não.
    *
    * @return retorna true caso a média das notas seja maior ou igual a 7, retorna false em caso contrário.
    */
    public boolean aprovado() {
        double media = this.calculaMedia();

        if(media >= 7) {
            return true;
        }
        return false;
    }

    /**
    * Adiciona horas empenhadas na disciplina em questão.
    *
    * @param horas Quantidade de horas a ser adicionada
    * @return void.
    */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    /**
    * Adiciona uma nova nota ao registro de notas, sobrescrevendo caso já tenha sido cadastrada anteriormente
    *
    * @param qualNota inteiro que informa qual nota está sendo cadastrada (1: primeira, 2: segunda, 3: terceira ou 4: quarta)
    * @param valorNota A nota que será adicionada a posição informada anteriormente.
    * @return void
    */
    public void cadastraNota(int qualNota, double valorNota) {
        int indexNota = qualNota - 1;
        this.notas[indexNota] = valorNota;
    }

    /**
    * Compila todas as informações contidas no objeto para uma string
    *
    * @return uma string no formato: nomeDaDisciplina horasDeEstudo mediaAritmética arrayDeNotas[5.0, 6.0, 7.0, 10.0]
    */
    public String toString() {
        double media = this.calculaMedia();
        String arrayString = "[" + notas[0] + ", " + notas[1] + ", " + notas[2] + ", " + notas[3] + "]";
        String stringDeRetorno = this.nome + " " + this.horasDeEstudo + " " + media + " " + arrayString;
        return stringDeRetorno;
    }
}
