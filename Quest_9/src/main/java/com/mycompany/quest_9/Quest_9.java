/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_9;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest_9 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ganho/hora trabalhada: ");
        float ganhoHora = s.nextInt();
        System.out.println("Horas trabalhadas no mes: ");
        float horas = s.nextInt();
        float salarioBruto = ganhoHora*horas;
        float impostoRenda = salarioBruto*0.11f;
        float inss = salarioBruto*0.08f;
        float sindicato = salarioBruto*0.05f;
        float salarioLiquido = salarioBruto-(impostoRenda+inss+sindicato);
        System.out.println("\nSalario bruto: "+salarioBruto);
        System.out.println("Imposto de renda: "+impostoRenda);
        System.out.println("INSS: "+inss);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Salario liquido: "+salarioLiquido);
    }
}
