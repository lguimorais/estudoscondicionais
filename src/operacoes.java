import java.util.Scanner;

public class operacoes {
    float valor1;
    float valor2;
    float result;
    Scanner teclado = new Scanner(System.in);
    public void soma() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextFloat();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextFloat();
        result = valor1 + valor2;
        System.out.println("o resultado é " + result);
    }
    public void subtracao() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextFloat();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextFloat();
        result = valor1 - valor2;
        System.out.println("o resultado é " + result);
    }
    public void multiplicacao() {
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextFloat();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextFloat();
        result = valor1 * valor2;
        System.out.println("o resultado é " + result);
    }
    public void divisao(){
        System.out.println("digite o primeiro valor:");
        valor1 = teclado.nextFloat();
        System.out.println("digite o segundo valor:");
        valor2 = teclado.nextFloat();
        if (valor2 == 0||valor1 == 0 ){
            System.out.println("não é possivel dividir numeros por 0");

        }else {
            result = valor1 / valor2;
            System.out.println("o resultado é " + result);
        }
    }
}