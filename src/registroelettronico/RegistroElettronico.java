/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroelettronico;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RegistroElettronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alunni;
        String[] materie = {"Informatica", "Tps", "Telecom", "Sistemi"};
        int[][] voti;
        int n;
        
        System.out.print("Imposta il numero di alunni: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        alunni = new String[n];
        voti = new int[n][materie.length];
        for(int i=0;i<n;i++) {
            System.out.print(String.format("Inserisci il nome dell'alunno %d: ",i+1));
            alunni[i] = sc.next();
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<materie.length;j++) {
            System.out.print(String.format("Inserisci il voto di %s per l'alunno %s: ", materie[j], alunni[i]));
            voti[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n");
        int media=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<materie.length;j++) {
                System.out.println(String.format("Il voto di %s per %s è %d", materie[j], alunni[i], voti[i][j]));
                media+=voti[i][j];
            }
            media=media/4;
            System.out.println(String.format("La media di %s è %d", alunni[i], media) + "\n\n");
        }
        
        
    }
    
    
}
