/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ano.numeroparimpar;

import java.util.Scanner;

/**
 *
 * @author Josenar
 */
public class NumeroParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println ("insere um número: "); 
        numero = scanner.nextInt();
        
        if (numero %2==0){
            System.out.println ("o numero" +numero + "é Par");
        }else {
            System.out.println ("O núnmero" +numero + "é impar"); 
        }
  scanner.close();
        
    }
}
