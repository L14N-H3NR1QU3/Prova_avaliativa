/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_8;

/**
 *
 * @author l.silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Quest_8 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int num = s.nextInt();
        
        FileWriter arquivo = new FileWriter ("C:\\Users\\l.silva\\Desktop\\TABUADA.txt");
        
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println("TABUADA de "+num);
        for(int i = 1; i <= 10; i++){
            gravar.println(num+" x "+i+" = "+(num*i));
        }
        arquivo.close();
    }
}
