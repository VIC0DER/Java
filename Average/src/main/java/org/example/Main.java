package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String firstNumber = JOptionPane.showInputDialog("Ingresa el primer numero:");
        String secondNumber = JOptionPane.showInputDialog("Ingresa el segundo numero:");
        String thirdNumber = JOptionPane.showInputDialog("Ingresa el tercer numero:");
        float average = (Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber) + Float.parseFloat(thirdNumber)) / 3;
        System.out.println("El promedio de los 3 numeros ingresados es: "+average);
    }
}