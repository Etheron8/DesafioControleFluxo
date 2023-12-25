import java.util.Scanner;

import ControleDeExecoes.ParametrosInvalidExptions;

import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner msg = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Primeiro Parametro");
        int param1 = msg.nextInt();

        System.out.println("Digite o Segundo Parametro");
        int param2 = msg.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidExptions e) {
            System.out.println("o Segundo parametro deve ser Maior que o primeiro");
            e.printStackTrace();
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidExptions {
        if (param1 > param2)
            throw new ParametrosInvalidExptions();

        int contagem = param2 - param1;
        for (int x = 0; x < contagem; x++)
            System.out.println(x);

    }
}
