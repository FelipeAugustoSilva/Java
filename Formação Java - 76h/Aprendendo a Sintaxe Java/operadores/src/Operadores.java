public class Operadores {
    public static void main(String[] args) throws Exception {
        int numero = 1958235;

        // numero = numero + 1857;
        numero++;

        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        int a, b;
        a = 15;
        b = 25;
        String resultado = a == b ? "Verdadeiro!" : "Falso!";
        /*
         * if (a == b) {
         * resultado = "Verdadeiro";
         * } else {
         * resultado = "Falso";
         * }
         */
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior a numero2? " + simNao);

        String nomeUm = "Felipe";
        String nomeDois = "Augusto";
        System.out.println(nomeUm == nomeDois);

        String nomeTres = "Felipe";
        String nomeQuatro = new String("Felipe");
        System.out.println(nomeTres.equals(nomeQuatro));

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("As duas condiçoes sao verdadeiras.");
        }
        System.out.println("fim!");
    }
}
