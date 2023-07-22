public class Aluno extends Usuario {
    int nota;
    int faltas;

    public Aluno(String nome, String curso) {
        super(nome, curso, "aluno");
    }


    public void receberNota(int nota) {
        if (nota <= 100) {
            this.nota = nota;
        } else {
            System.out.println("nota invalida,somente sao permitidas <=100");
        }

    }

    public void receberFaltas(int faltas) {
        if (faltas <= 120) {
            this.faltas += faltas;
        } else {
            System.out.println("aluno já ultrapassou o limiute  de faltas");
        }
    }

    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        System.out.println("Suas informacoes academicas sao:");
        System.out.println("Nota " + this.nota);
        System.out.println("Faltas " + this.faltas);
    }
}


