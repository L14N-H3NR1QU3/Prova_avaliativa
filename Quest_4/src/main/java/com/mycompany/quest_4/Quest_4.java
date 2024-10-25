/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_4;

import javax.swing.JOptionPane;

/**
 *
 * @author l.silva
 */
public class Quest_4 {

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite um numero: ");
        int n = Integer.parseInt(num);
        JOptionPane.showMessageDialog(null, "O antecessor: "+(n-1));
        JOptionPane.showMessageDialog(null, "O sucessor: "+(n+1));
    }
}
