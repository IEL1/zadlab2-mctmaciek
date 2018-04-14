package pl.edu.ur.main;

import java.util.Scanner;



public class zad3 {
    public static void main(String[] args) {
        int tab[]= new int[10];
        int opcja=-1;
        Scanner wczytaj =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print("Podaj "+(i+1)+" liczbe:");
            tab[i]=wczytaj.nextInt();
        }
        

        do{
        if (opcja==-1){
                 System.out.println("[1] - Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
                 System.out.println("[2] - Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
                 System.out.println("[3] - Wyświetlanie elementów o nieparzystych indeksach");        
                 System.out.println("[4] - Wyświetlanie elementów o parzystych indeksach");
                 
            opcja=wczytaj.nextInt();
        }
        else if(opcja==1){
            for(int i=0;i<10;i++){
                System.out.println("Tablica["+i+"]="+tab[i]);
            } 
            opcja=-1;
        }else if(opcja==2){
            for(int i=9;i>=0;i--){
                System.out.println("Tablica["+i+"]="+tab[i]);
            }
            opcja=-1;
        }else if(opcja==3){
            for(int i=0;i<10;i++){
                if(((i%2)==0))
                    System.out.println("Tablica["+i+"]="+tab[i]);
                }
            opcja=-1;
        }else if(opcja==4){
            for(int i=0;i<10;i++){
                if(((i%2)!=0)){
                    System.out.println("Tablica["+i+"]="+tab[i]);
                }
            }
            opcja=-1;            
        }else if(opcja==0){
            opcja=0;
        }else{System.out.println("....");}
        }while(opcja!=0);
        System.out.println("....");
    }
    
}
