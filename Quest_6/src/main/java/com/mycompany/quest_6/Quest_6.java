/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_6;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        boolean entrada = true;
        float soma = 0;
        float media = 0;
        int qtd = 0;
        do{
            System.out.println("Digite um valor: (Digite qualquer letra para sair)");
            String resp = s.next();
            try{
                int val = Integer.parseInt(resp);
                soma += val;
                qtd++;
            }
            catch(NumberFormatException e){
                entrada = false;
            }
        }while(entrada);
        System.out.println("Soma: "+soma);
        System.out.println("Quantidade: "+qtd);
        System.out.println("Media: "+(soma/qtd));
    }
}
