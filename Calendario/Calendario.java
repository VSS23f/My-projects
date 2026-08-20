/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calendario;


import javax.swing.JOptionPane;
public class Calendario {
     
      
    public static String diaSemana(int dia){
          return switch (dia) {
              case 1 -> "Domingo";
              case 2 -> "Segunda-feira";
              case 3 -> "Terça-feira";
              case 4 -> "Quarta-feira";
              case 5 -> "Quinta-feira";
              case 6 -> "Sexta-feira";
              case 7 -> "Sábado";
              default -> "Dia inválido";
          };
    }
     
       public static void diaSemana(int dia, int tipoMensagem) {
        String mensagem = diaSemana(dia);

        if (tipoMensagem == 1) {
            System.out.println(mensagem);
        } else if (tipoMensagem == 2) {
            JOptionPane.showMessageDialog(null, mensagem, "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Tipo de mensagem inválido");
        }
     }
 
 }

