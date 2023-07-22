public class Usuario {
        String nome;
        String curso;
        String turma;
        String sala;
        String tipoUsuario;
        Usuario(String nome, String curso, String tipoUsuario) {
            this.nome = nome;
            this.curso = curso;
            this.tipoUsuario = tipoUsuario;
        }

            public void apresentarinformacoes(){
                System.out.println("---------"+tipoUsuario+"---------");
                System.out.println("Nome:"+nome);
                System.out.println("Curso:"+curso);
                System.out.println("turma:"+turma);
                System.out.println("sala:"+sala);



        }


    }
}