/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/

import javax.swing.JOptionPane;

public class Tarea_16 {
    public static void main(String[] args){
        String ingreso_datos;
        String[] conversiones = {"Centigrados a Farenheit", "Farenheit a Centigrados"};
        double grados, faren, centi;

        ingreso_datos = JOptionPane.showInputDialog("Ingresa los grados a convertir: ");
        grados = Double.parseDouble(ingreso_datos);

        int conversor = JOptionPane.showOptionDialog(null,"Los grados a convertir son: " + grados, "Conversiones",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, conversiones, null);

        switch (conversor +1){ //ESE MALDITO +1 ES IMPORTANTE... AHHHHHHHHH!!!!!
            case 1: //C a F

                faren = (grados * 1.8) + 32;
                JOptionPane.showMessageDialog(null, faren + " Grados Fahrenheit", "Conversion Final", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2: //F a C
                centi = (grados - 32) / 1.8;
                JOptionPane.showMessageDialog(null, centi + " Grados Centigrados", "Conversion Final", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
}