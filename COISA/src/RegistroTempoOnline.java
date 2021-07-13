
/**
* Gerencia e monitora a quantidade de tempo online gasta/necessária de uma determinada disciplina em curso,
* permitindo o fornecimento e manipulação dessas informações.
* 
* @author Yohan Lopes Rodrigues - 118 110 773
*/


public class RegistroTempoOnline {
    /**
    * Nome da disciplina.
    */
    private String disciplina;

    /**
    * Quantidade de tempo já empenhada na disciplina.
    */
    private int expendedTime = 0;

    /**
    * Meta de tempo a ser gasto na disciplina, por padrão 120 horas.
    */
    private int timeGoal = 120;

    /**
    * Constrói um registro do tempo online investido em uma disciplina a partir de um nome fornecido para indentificá-la
    *
    * @param nomeDisciplina Nome da disciplina a que o registro diz respeito.
    */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.disciplina = nomeDisciplina;
    }

    /**
    * Constrói um registro do tempo online investido em uma disciplina a partir de um nome que a identifique
    * e de uma quatidade de horas que devem ser atingidas
    *
    * @param nomeDisciplina Nome da disciplina a que o registro dis respeito
    * @param timeGoal Quantidade de tempo (em horas) online meta a ser atingido.
    */
    public RegistroTempoOnline(String nomeDisciplina, int timeGoal) {
        this.disciplina = nomeDisciplina;
        this.timeGoal = timeGoal;
    }

    /**
    * Incrementa o valor de tempo gasto online
    *
    * @return void
    */
    public void adicionaTempoOnline(int incrementAmmount) {
        this.expendedTime += incrementAmmount;
    }

    /**
    * Verifica se a meta de tempo foi atingida
    *
    * @return retorna true caso o tempo meta tenha sido atingido, retorna false caso contrário
    */
    public boolean atingiuMetaTempoOnline() {
        if(this.expendedTime >= this.timeGoal) {
            return true;
        }
        return false;
    }

    /**
    * Constrói e retorna uma string com todos os dados do objeto compilados
    *
    * @return Retorna uma string com os dados do objeto no formato: nomeDaDisciplina horasEmpenhadas/metaDeHoras;
    */
    public String toString() {
        String state = disciplina + " " + expendedTime + "/" + timeGoal;
        return state;
    }
}
