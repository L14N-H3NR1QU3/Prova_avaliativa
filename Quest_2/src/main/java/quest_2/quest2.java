/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package quest_2;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class quest2 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite quantos anos voce tem: ");
        int anoNascido = s.nextInt();
        System.out.println("Digite quantos meses voce tem de idade: (des do seu ultimo aniversario) ");
        int mesNascido = s.nextInt();
        System.out.println("Digite quantos dias voce tem de idade: (des do seu ultimo aniversario)");
        int diaNascido = s.nextInt();
        int diasVivos = 0;
        diasVivos += anoNascido * 365;
        diasVivos += mesNascido * 30;
        diasVivos += diaNascido;
        System.out.println("Voce tem des do seu ultimo aniversario "+diasVivos+" dias vividos");
    }
}
