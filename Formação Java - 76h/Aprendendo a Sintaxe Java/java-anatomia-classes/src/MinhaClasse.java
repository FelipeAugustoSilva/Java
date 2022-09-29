public class MinhaClasse {
    public static void main(String[] args) {

        // Declaração de variavel, TIPO, NOME DA VARIAVEL = VALOR DA VARIAVEL;
        // A variavel pode ser vazia.

        String primeiroNome = "Felipe";
        String segundoNome = "Augusto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Declaração de Metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
