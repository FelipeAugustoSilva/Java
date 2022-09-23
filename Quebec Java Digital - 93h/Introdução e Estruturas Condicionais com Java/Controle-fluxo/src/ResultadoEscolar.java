public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.3;

        if (nota >= 7) {
            System.out.println("Aprovado, Parabens!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado, Eu sinto muito, boa sorte na proxima vez!");
        }
    }

}