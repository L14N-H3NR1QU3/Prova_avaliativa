/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_12;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_12 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int vet[] = new int [11];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            vet[i] = s.nextInt();
        }
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++){
                if(vet[j] < vet[i]){
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < 10; i++){
            System.out.println(vet[i]);
        }
        System.out.println("Digite mais um numero: ");
        vet[10] = s.nextInt();
        for(int j = 0; j < 11; j++){
            for(int i = 0; i < 11; i++){
                if(vet[j] < vet[i]){
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < 11; i++){
            System.out.println(vet[i]);
        }
    }
}
