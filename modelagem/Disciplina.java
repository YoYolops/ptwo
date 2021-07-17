public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int cargaHorariaDeExercicios = 0;
    private int quantExercicios = 0;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionaExercicios(int quantExercicios, int cargaHoraria) {
        this.quantExercicios += quantExercicios;
        this.cargaHorariaDeExercicios += cargaHoraria;
    }

    public String cargaHorariaExercicios() {
        return "" + this.cargaHorariaDeExercicios;
    }

    public int totalExercicios() {
        return this.quantExercicios;
    }

    //Programação 2: 10 execicio(s) CargaTotal 30H CargaExercicio 9H
    public String toString() {
        return this.nome + ": " + this.quantExercicios + " exercicio(s) CargaTotal " + this.cargaHoraria + " H" + " CargaExercicio " + this.cargaHorariaDeExercicios + "H";
    }
}
