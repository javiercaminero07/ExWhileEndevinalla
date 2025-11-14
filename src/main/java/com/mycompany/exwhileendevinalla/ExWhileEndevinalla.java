/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exwhileendevinalla;

/**
 *
 * @author javie
 */
import java.util.*;
public class ExWhileEndevinalla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        int randomnum = (int)(Math.random() * 11);
        try{
          do{
        System.out.println();
        System.out.println("Digues un numero de l'1 al 10: ");
        nombre = scanner.nextInt();
        System.out.println("> " + nombre);
        if (nombre != randomnum){
            System.out.println("No has endevinat el nombre");
        }
        } while (!(nombre == randomnum));  
        }catch (InputMismatchException e){
            System.out.println("Has de ficar un numero, no una lletra");
        }
    }
}
