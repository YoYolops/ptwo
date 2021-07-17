

public class Pland {

    public static void main(String[] args) {

       int cargaHoraria = 30; //horas

        Disciplina p2 = new Disciplina("Programação 2", cargaHoraria);

        p2.adicionaExercicios(2, 1);

        p2.adicionaExercicios(3, 3);

        System.out.println(p2.cargaHorariaExercicios());

        System.out.println(p2.totalExercicios());

        p2.adicionaExercicios(5, 5);

        System.out.println(p2.toString());

        System.out.println("====");

        

        cargaHoraria = 60;

        Disciplina calculo = new Disciplina("Calculo", cargaHoraria);

        System.out.println(calculo.totalExercicios());

        System.out.println(calculo.toString());

        System.out.println("====");

 

        int numColegas = 4;

        GrupoEstudo estudoP2 = new GrupoEstudo("Programação 2", numColegas);

        estudoP2.cadastraColega(0, "Maria");

        estudoP2.cadastraColega(1, "Pedro");

        estudoP2.cadastraColega(2, "Mateus");

        System.out.println(estudoP2.totalCadastrados());

        System.out.println(estudoP2.getColega(0));

        System.out.println(estudoP2.getColega(3));

        System.out.println(estudoP2.isColega("Jose"));

        System.out.println(estudoP2.toString());

        System.out.println("====");

 

        int[] pesosAtividade = new int[]{1, 3, 2, 4};

        Rendimento rendimentoP2 = new Rendimento("Programação 2", pesosAtividade);

        rendimentoP2.cadastraAtividade(0, 10.0);

        rendimentoP2.cadastraAtividade(1, 8.0);

        rendimentoP2.cadastraAtividade(2, 7.5);

        System.out.println(rendimentoP2.media());

        System.out.println(rendimentoP2.aprovado());

        rendimentoP2.cadastraAtividade(3, 7.5);

        rendimentoP2.setPesoAtividade(0, 2);

        rendimentoP2.setPesoAtividade(1, 2);

        System.out.println(rendimentoP2.aprovado());

        System.out.println(rendimentoP2.toString());

        System.out.println("====");

    }

}