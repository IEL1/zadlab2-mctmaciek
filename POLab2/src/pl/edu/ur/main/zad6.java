
package pl.edu.ur.main;

import java.util.Scanner;


public class zad6 {
    

    public static void main(String[] args) {
        int zmienna;
        Scanner wczytaj =new Scanner(System.in);
          while(true){
            System.out.print("Wprowadz zmienną : ");
            zmienna= wczytaj.nextInt();
            if(zmienna<0){
            break;
            }
          }
            
    }      
}
