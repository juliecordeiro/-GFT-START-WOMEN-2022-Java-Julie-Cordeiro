package Exercicios.tres;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int[] idades = new int[5];
        double[] pesos = new double[5];
        double[] alturas = new double[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Por favor informe uma idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Por favor informe um peso: ");
            pesos[i] = scanner.nextDouble();

            System.out.print("Por favor informe uma altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double somaDasIdades = 0;
        int quantidadePessoasPesoSuperiorA90 = 0;
        int quantidadeDePessoasEntre10E30Anos = 0;
        for(int i = 0; i < 5; i++) {
            somaDasIdades += idades[i];

            if (pesos[i] > 90 && alturas[i] < 1.50)
                quantidadePessoasPesoSuperiorA90++;

            if ((idades[i] > 10 || idades[i] < 30) && alturas[i] > 1.90)
                quantidadeDePessoasEntre10E30Anos++;
        }

        System.out.println("Média de idade das pessoas: " + somaDasIdades / 5);
        System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50: " + quantidadePessoasPesoSuperiorA90);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90: " + (quantidadeDePessoasEntre10E30Anos * 100) / 5);

    }

}
