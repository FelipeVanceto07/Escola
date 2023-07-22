public class Main {
    public static void main(String[] args) {

        Professor  professor1 = new Professor ("felipe","Fundamentos de Java");
        professor1.criarTurma("FJ2023");

        professor1.matricularAluno(new Aluno("Joao", professor1.curso));
        professor1.matricularAluno(new Aluno("Nicolau", professor1.curso));
        professor1.matricularAluno(new Aluno("Feliper", professor1.curso));
        professor1.matricularAluno(new Aluno("Maria", professor1.curso));
        professor1.matricularAluno(new Aluno("Lucas", professor1.curso));

        professor1.reservarSala("Sala1");
        for(Aluno aluno:  professor1.listaAlunos) {
            professor1.darNotas(aluno, 50);
            professor1.darFaltas(aluno, 2);
        }
            professor1.apresentarInformacoes();
        for(Aluno aluno:  professor1.listaAlunos) {
            aluno.apresentarInformacoes();
        }
    }
}

