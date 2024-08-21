import java.util.Scanner;

public class operacoes {
    int valor1;
    int valor2;
    int result;
    Scanner teclado = new Scanner(System.in);
    public void soma() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextInt();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextInt();
        result = valor1 + valor2;
        System.out.println("o resultado é " + result);
    }
    public void subtracao() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextInt();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextInt();
        result = valor1 - valor2;
        System.out.println("o resultado é " + result);
    }
    public void multiplicacao() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextInt();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextInt();
        result = valor1 * valor2;
        System.out.println("o resultado é " + result);
    }
    public void divisao(){
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextInt();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextInt();
        if (valor2 == 0||valor1 == 0 ){
            System.out.println("não é possivel dividir numeros por 0");

        }else {
            result = valor1 / valor2;
            System.out.println("o resultado é " + result);
        }
    }
}