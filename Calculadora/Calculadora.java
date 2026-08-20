/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author Vitor
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
         
       int opcao = -1;

        System.out.println(".....Calculadora.....");

        while (opcao != 0) {

            System.out.println("\nSelecione a operação:");
            System.out.println("1. Soma | 2. Subtração | 3. Multiplicação | 4. Divisão | 5. Resto | 6. Potência | 0. Sair");
            System.out.print("Opção: ");

            opcao = s.nextInt();

            if (opcao >= 1 && opcao <= 6) {

                System.out.print("Digite valor 1: ");
                double x = s.nextDouble();

                System.out.print("Digite valor 2: ");
                double y = s.nextDouble();
                

                switch (opcao) {
                   
                    case 1:
                        System.out.println("Resultado: " + df.format(x + y));
                        break;

                    case 2:
                        System.out.println("Resultado: " + df.format(x - y));
                        break;

                    case 3:
                        System.out.println("Resultado: " + df.format(x * y));
                        break;

                    case 4:
                        if (y != 0 && x !=0) {
                            System.out.println("Resultado: " + df.format(x / y));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;

                    case 5:
                        System.out.println("Resultado: " + df.format(x % y));
                        break;

                    case 6:
                        System.out.println("Resultado: " + df.format(Math.pow(x, y)));
                        break;
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
        s.close();
    }
}
 