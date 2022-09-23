public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1895025.0;
        double valorSolicitado = 75960.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor retirado com sucesso, porfavor aguarde a contagem das celulas!");
        } else {
            System.out.println("Saldo insuficiente, porfavor digite outro valor!");
        }
        System.out.println("Seu saldo atual é de R$" + saldo);

    }
}
