
/**
* Gerenciador de rotina de descanso.
* Responsável por estabelecer as horas de descanso e número de semanas além de fornecer string para
* exibir o estado em que se encontra o estudante (cansado ou descansado), baseado nas informações descritas acima.
*
* @author Yohan Lopes Rodrigues - 118 110 773
*/
public class Descanso {
    /**
    * Quantidade de horas gastas pelo estudantes com atividades de lazer e/ou sono.
    */
    private int restHours = 0;

    /**
    * Número de semanas decorridas
    */
    private int numberOfWeeks = 0;

    /**
    * Modifica a quantidade de horas dedicadas ao descanso .
    *
    */
    public void defineHorasDescanso(int hours) {
        this.restHours = hours;
    }

    /**
    * Modifica a quantidade de semanas decorridas.
    *
    */
    public void defineNumeroSemanas(int semanas) {
        this.numberOfWeeks = semanas;
    }

    /**
    * Retorna o booleano que responde: O aluno está cansado?
    * baseado na quantidade de horas de descanço e no número de semanas decorridas
    * sendo que a quantidade mínima de descanso semanal para ser considerado descansado é 26 horas.
    * 
    * @param restHours Quantidades de horas empenhadas em atividades de lazer/descanso.
    * @param numberOfWeeks Quantidade de semanas decorridas.
    * @return o booleano que diz se é verdade que o aluno está cansado
    */
    private boolean isTired(int restHours, int numberOfWeeks) {
        int restPerWeek;

        if(this.numberOfWeeks > 0) {
            restPerWeek = restHours / numberOfWeeks;
        } else {
            restPerWeek = 0;
        }
        
        if(restPerWeek >= 26) { return false; }

        return true;
    }

    /**
    * Retorna uma string que informa o status do estudante, podendo esta ser "cansado" ou "descansado"
    *
    * @return A string com o status do estudante ("cansado" ou "descansado")
    */
    public String getStatusGeral() {
        boolean isTired = this.isTired(this.restHours, this.numberOfWeeks);

        if(isTired) { return "cansado"; }

        return "descansado";
    }
}
