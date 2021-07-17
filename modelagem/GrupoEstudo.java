public class GrupoEstudo {
    private String nomeDisciplina;
    private String[] arrayColegas;

    public GrupoEstudo(String nome, int quant) {
        this.nomeDisciplina = nome;
        this.arrayColegas = new String[quant];
    }

    public void cadastraColega(int index, String nome) {
        this.arrayColegas[index] = nome;
    }

    public int totalCadastrados() {
        int contador = 0;

        for(int i = 0; i < arrayColegas.length; i++) {
            if(this.arrayColegas[i] != null) {
                contador += 1;
            }
        }

        return contador;
    }

    public String getColega(int index) {
        if(this.arrayColegas[index] == null) {
            return "--SEM COLEGA--";
        }
        return this.arrayColegas[index];
    }

    public boolean isColega(String nome) {
        for(int i = 0; i < this.arrayColegas.length; i++) {
            if(this.arrayColegas[i] == nome) {
                return true;
            }
        }
        return false;
    }

    // Grupo de Estudo de Programação 2 Capacidade: 3/4
    public String toString() {
        int vagasOculpadas = this.totalCadastrados();

        return "Grupo de Estudo de " + this.nomeDisciplina + " Capacidade: " + vagasOculpadas+ "/" + this.arrayColegas.length;
    }
}
