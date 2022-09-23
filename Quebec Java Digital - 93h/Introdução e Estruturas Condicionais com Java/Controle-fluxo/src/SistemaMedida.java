public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        if (sigla == "P") {
            System.out.println("Pequeno");
        } else if (sigla == "M") {
            System.out.println("Medio");
        } else if (sigla == "G") {
            System.out.println("Grande");
        } else if (sigla == "GG") {
            System.out.println("Extra Grande");
        } else {
            System.out.println("Indefinido");
        }
    }

}
