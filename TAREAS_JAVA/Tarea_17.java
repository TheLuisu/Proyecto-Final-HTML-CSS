/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/

import javax.swing.JOptionPane;

public class Tarea_17 {
    public static void main(String[] args){
        String ingreso_datos;
        String[] conversiones = {"Peso a Dolar","Peso a Euro", "Peso a Yen Japones","Peso a Dolar (Hong Kong)"};
        double pesos, dolar, euro, yen, hong;

        ingreso_datos = JOptionPane.showInputDialog("Ingresa los pesos a convertir: ");
        pesos = Double.parseDouble(ingreso_datos);

        int conversor = JOptionPane.showOptionDialog(null, "Los pesos a convertir son: " + pesos, "Conversion",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, conversiones, null);
        switch (conversor +1){
            case 1:
                dolar = 0.05*pesos;
                JOptionPane.showMessageDialog(null, dolar + " Dolares", "Conversion Peso - Dolar", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                euro = 0.0415*pesos;
                JOptionPane.showMessageDialog(null, euro + " Euros", "Conversion Peso - Euro", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                yen = 5.4768*pesos;
                JOptionPane.showMessageDialog(null, yen + " Yenes", "Conversion Peso - Yen", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                hong = 0.39*pesos;
                JOptionPane.showMessageDialog(null, hong + " Dolares Hong Kong", "Conversion Peso - Dolar Hong Kong", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
}
