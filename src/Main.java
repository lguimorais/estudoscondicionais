import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opmath;
        operacoes op = new operacoes();
        Scanner teclado = new Scanner(System.in);
        System.out.println("selecione a opção desejada:");
        System.out.println("1-soma");
        System.out.println("2-subtração");
        System.out.println("3-multiplicação");
        System.out.println("4-divisão");
        opmath = teclado.nextInt();
        switch (opmath) {
            case 1:
                op.soma();
                break;
            case 2:
                op.subtracao();
                break;
            case 3:
                op.multiplicacao();
                break;
            case 4:
                op.divisao();
        }

    }
}