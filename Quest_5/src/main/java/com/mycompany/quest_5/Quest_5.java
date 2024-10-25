/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_5;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_5 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String nome = "usuario";
        String senha = "1234";
        String nomeUser;
        String senhaUser;
        do{
            System.out.println("\nNome do usuario: ");
            nomeUser = s.next();
            if(!nomeUser.endsWith(nome)){
                System.out.println("Usuario invalido!");
            }
        }while(!nomeUser.equals(nome));
        do{
            System.out.println("\nSenha: ");
            senhaUser = s.next();
            if(!senhaUser.endsWith(senha)){
                System.out.println("Senha incorreta!");
            }
            else{
                System.out.println("Acesso permitido");
            }
        }while(!senhaUser.equals(senha));
    }
}
