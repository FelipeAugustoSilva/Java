public class SistemaMedida2 {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            case "GG": {
                System.out.println("Extra Grande");
                break;
            }
            default: {
                System.out.println("Indefinido");
                break;

            }
        }
    }
}
