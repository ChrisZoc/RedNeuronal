/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redneuronaland;

import javax.swing.JOptionPane;

/**
 *
 * @author FRK
 */
public class RedNeuronalAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"Ingresa el peso W1 , el W2, el umbral y alpha", JOptionPane.WARNING_MESSAGE);
        String [] array = aux.split(",");
        double w1 = Double.parseDouble(array[0]);
        double w2 = Double.parseDouble(array[1]);
        double umbral = Double.parseDouble(array[2]);
        double alpha = Double.parseDouble(array[3]);
        
        Neurona neuro = new Neurona(w1,w2,umbral, alpha);
        aux = JOptionPane.showInputDialog(null,"Ingresa el x1, x2", JOptionPane.WARNING_MESSAGE);
        array = aux.split(",");
        double [] arrayDouble;
        while(true){
            arrayDouble = neuro.epoca(Integer.parseInt(array[0]),Integer.parseInt(array[1]), 0);
        }

        
        
    }
    
}
