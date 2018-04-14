
package pl.edu.ur.polab2;


import java.util.Scanner;



public class zad4 {
    

public static void main(String[] args) {
        int tab[]= new int[10];
        int opcja=-1;
        int obl=0;
        Scanner wczytaj =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print("Podaj "+(i+1)+" liczbe:");
            tab[i]=wczytaj.nextInt();
        }
        

        do{
            switch (opcja) {
                case -1:
                    System.out.println("[1] - suma");
                    System.out.println("[2] - iloczyn");
                    System.out.println("[3] - max");
                    System.out.println("[4] - srednia");
                    System.out.println("[5] - min");
                    opcja=wczytaj.nextInt();
                    break;
                case 1:
                    for(int i=0;i<10;i++){
                        obl+=tab[i];
                    }       System.out.println("Suma elementow w tablicy:"+obl);
                    obl=0;
                    opcja=-1;
                    break;
                case 2:
                    obl=tab[0];
                    for(int i=1;i<10;i++){
                        obl=obl*tab[i];
                    }       System.out.println("Iloczyn elementow w tablicy:"+obl);
                    obl=0;
                    opcja=-1;
                    break;
                case 3:
                    obl=tab[0];
                    for(int i=1;i<10;i++){
                        if(tab[i]>obl){
                            obl=tab[i];
                        }
                    }       System.out.println("Maxymalny element"+obl);
                    obl=0;
                    opcja=-1;
                    break;
                case 4:
                    for(int i=0;i<10;i++){
                        obl+=tab[i];
                    }       System.out.println("Srednia:"+(obl/10));
                    obl=0;
                    opcja=-1;
                    break;
                case 5:
                    obl=tab[0];
                    for(int i=1;i<10;i++){
                        if(tab[i]<obl){
                            obl=tab[i];
                        }
                    }       System.out.println("Maxymalny element"+obl);
                    obl=0;
                    opcja=-1;
                    break;
                case 0:
                    opcja=0;
                    break;
                default:
                    break;
            }
    
    

