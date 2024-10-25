/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_7;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String nomeJ1;
        String nomeJ2;
        String dicas[] = new String [5];
        String filme;
        String resp;
        int chances = 5;
        System.out.println("Nome do jogador 1: ");
        nomeJ1 = s.next();
        System.out.println("Nome do filme: ");
        filme = s.next();
        for(int i = 0; i < 5; i++){
            System.out.println("Dica "+(i+1)+": ");
            dicas[i] = s.next();
        }
        System.out.println("Nome do jogador 2: ");
        nomeJ2 = s.next();
        for(int i = 0; i < 5; i++){
            System.out.println("Dica "+(i+1)+": "+dicas[i]);
            System.out.println("Nome do filme: ");
            resp = s.next();
            if(!resp.equals(filme)){
                chances--;
            }
            else{
                System.out.println("Jogador 2 venceu!");
            }
        }
        if(chances == 0){
            System.out.println("Jogador 1 venceu!");
        }
    }
}
