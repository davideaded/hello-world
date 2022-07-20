import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Equacao e1 = new Equacao();
        Delta dt = new Delta();
        Eqx xnXp = new Eqx();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        dt.setA(entrada.nextDouble());

        System.out.println("Insira o valor de B:");
        dt.setB(entrada.nextDouble());

        System.out.println("Insira o valor de C:");
        dt.setC(entrada.nextDouble());

        dt.calculaDelta();
        System.out.println("Delta: " + dt.getDelta());
        if (dt.getDelta() < 0) {
            System.out.println("A equacao nao possui raizes reais.");
        } else {
            System.out.println("xn: " + xnXp.calculaXn(dt));
            System.out.println("xp: " + xnXp.calculaXP(dt));
        }

    }
    }