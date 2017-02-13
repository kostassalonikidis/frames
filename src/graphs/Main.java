/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
      import javax.swing.JOptionPane;

/**
 *
 * @author ksalonikidis
 */
public class Main {

   

 public static void main(String[] args)
 {
        String firstNumber =JOptionPane.showInputDialog("Enter first integer");
        String secondNumber =JOptionPane.showInputDialog("Enter second integer");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int result=number1+number2;
        
        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, "The result is " + result, "Apotelesma auroismatos", JOptionPane.WARNING_MESSAGE);
    }
    
}

