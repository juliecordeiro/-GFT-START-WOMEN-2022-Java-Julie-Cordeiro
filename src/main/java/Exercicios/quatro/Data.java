package Exercicios.quatro;

import java.util.Scanner;

public class Data {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe seu aniversário: (Formato válido: 02/03/1992)");
        final String aniversario = scanner.nextLine();

        String[] aniversarioSeparado = aniversario.split("/");

        if (aniversarioSeparado.length != 3){
            System.out.println("Data inválida!");
            return;
        }

        if (Integer.parseInt(aniversarioSeparado[0]) < 0 || Integer.parseInt(aniversarioSeparado[0]) > 31){
            System.out.println("Data inválida!");
            return;
        }

        if (Integer.parseInt(aniversarioSeparado[1]) < 0 || Integer.parseInt(aniversarioSeparado[1]) > 12){
            System.out.println("Data inválida!");
            return;
        }

        if (Integer.parseInt(aniversarioSeparado[2]) < 0 || Integer.parseInt(aniversarioSeparado[2]) > 2000){
            System.out.println("Data inválida!");
            return;
        }

        System.out.println("Data válida!");
    }
}
