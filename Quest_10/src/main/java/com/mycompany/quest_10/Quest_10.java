/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_10;

/**
 *
 * @author l.silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Quest_10 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        System.out.println("Quantidade de cadastros: ");
        int tam = s.nextInt();
        String nomeProd[] = new String[tam];
        float valProd[] = new float[tam];
        for(int i = 0; i < tam; i++){
            System.out.println("Digite o nome do produto "+(i+1)+": ");
            nomeProd[i] = s.next();
            System.out.println("Digite o valor do produto "+(i+1)+": ");
            valProd[i] = s.nextFloat();
        }
        for(int i = 0; i < tam; i++){
            JOptionPane.showMessageDialog(null, "Nome: "+nomeProd[i]+"\nPreço: R$"+valProd[i]);
        }
        FileWriter arquivo = new FileWriter ("Cadastro pedidos.txt");
        PrintWriter gravar = new PrintWriter (arquivo);
        gravar.println("Lista cadastro:");
        gravar.println("---------------------");
        for(int i = 0; i < tam; i++){
            gravar.println("Nome: "+nomeProd[i]+"\nPreço: R$"+valProd[i]);
            gravar.println("---------------------");
        }
        arquivo.close();
    }
}
