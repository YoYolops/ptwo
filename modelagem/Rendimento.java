
public class Rendimento {
    String nomeDisciplina;
    int[] pesoAtividade;
    double[] notas;

    public Rendimento(String nome, int[] peso) {
        this.nomeDisciplina = nome;
        this.pesoAtividade = peso;
        this.notas = new double[peso.length];
    }

    public void cadastraAtividade(int index, double nota) {
        this.notas[index] = nota;
    }

    public double media() {
        double somaComPesos = 0;
        int somaDosPesos = 0;

        for(int i = 0; i < notas.length; i++) {
            somaComPesos += notas[i] * pesoAtividade[i];
            somaDosPesos += pesoAtividade[i];
        }

        double media = somaComPesos/somaDosPesos;
        return media;
    }

    public boolean aprovado() {
        double media = this.media();

        if(media >= 7) {
            return true;
        }
        return false;
    }

    public void setPesoAtividade(int index, int peso) {
        this.pesoAtividade[index] = peso;
    }

}
