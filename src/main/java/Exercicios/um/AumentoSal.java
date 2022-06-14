package Exercicios.um;

import java.util.Scanner;

public class AumentoSal {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner( System.in );
        System.out.println("Informe salario: ");
        final Double salarioColaborador = scanner.nextDouble();

        int percentualDeAumento = 0;
        Double valorDoAumento = 0.0;
        Double novoSalario = 0.0;

        if (salarioColaborador < 280)
            percentualDeAumento = 20;
        else if (salarioColaborador >= 280 && salarioColaborador < 700)
            percentualDeAumento = 15;
        else if (salarioColaborador >= 700 && salarioColaborador < 1500)
            percentualDeAumento = 10;
        else if (salarioColaborador >= 1500)
            percentualDeAumento = 5;

        valorDoAumento = (salarioColaborador * percentualDeAumento) / 100;
        novoSalario = salarioColaborador + valorDoAumento;

        System.out.println( "Salário atual do colaborador: " + salarioColaborador );
        System.out.println( "Percentual de aumento aplicado: " + percentualDeAumento + "%" );
        System.out.println( "Valor do aumento: " + valorDoAumento );
        System.out.println( "Novo salário: " + novoSalario );
    }
}
