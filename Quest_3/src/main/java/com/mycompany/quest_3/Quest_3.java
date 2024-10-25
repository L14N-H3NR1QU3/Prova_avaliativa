/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_3;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String nomeMenu[] = {"cafe expresso", "cafe capuccino", "leite com cafe"};
        float valMenu[] = {0.75f, 1.00f, 1.75f};
        int qtd[] = new int [3];
        boolean entrada = true;
        float total = 0;
        do{
            System.out.println("Digite sua escolha do menu: ");
            for(int i = 0; i < 3; i++){
                System.out.println((i+1)+" - R$"+valMenu[i]+" "+nomeMenu[i]);
            }
            System.out.println("4 - totalizar vendas \nEscolha:");
            String resp = s.next();
            try{
                int res = Integer.parseInt(resp);
                if(res < 0 || res > 4){
                    System.out.println("Escolha invalida!");
                }
                else if(res == 4){
                    entrada = false;
                }
                else{
                    qtd[res-1]++;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Escolha invalida!");
            }
        }while(entrada);
        System.out.println("Nota/-------");
        for(int i = 0; i < 3; i++){
            System.out.println(nomeMenu[i]+" quantidade: "+qtd[i]+" valor: R$"+(qtd[i]*valMenu[i]));
            total += qtd[i]*valMenu[i];
        }
        System.out.println("Total: R$"+total);
    }
}
