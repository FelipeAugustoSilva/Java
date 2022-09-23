public class alunosArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS", "LUCAS", "MARIA", "LUAN", "JOANA", "FABIO",
                "FERNANDA" };

        for (int x = 0; x < alunos.length; x++) {
            // for (String aluno : alunos)
            // System.out.println("Nome do aluno é " + alunos);
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }

}
