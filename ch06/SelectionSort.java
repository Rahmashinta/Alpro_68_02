/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author Rahma
 */
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("ingin mengurutkan angka dari mana ?");
        System.out.println("1. Dari terkecil ke terbesar");
        System.out.println("2. Dari terbesar ke terkecil");
        System.out.print("masukkan pilihan anda = " + " ");
        int pilihan = sc.nextInt();
        
        if (pilihan == 1){
            System.out.print("urutan array yaitu = " + " ");
            for (int a = 0; a < x.length-1; a++){
                int max = a;
                for (int b = a; b < x.length; b++){
                
                    if(x[b] < x[max]){
                        max = b;
                    }
                    
                }int p = x[a];
                    x[a] = x[max];
                    x[max] = p;
            }
                for ( int a = 0; a < x.length; a++){
                System.out.print(x[a] + " ");
                }
        
        }else if (pilihan == 2){
            System.out.print("urutan array yaitu = " + " ");
                for (int a = 0; a < x.length; a++){
                    int max = a;
                    for (int b = a; b < x.length-1; b++){
                        if ( x[b]> x[max]){
                            max = b;
                        }
                            
                    }int p = x[a];
                            x[a] = x[max];
                            x[max] = p;
                }for ( int a = 0; a < x.length; a++){
                    
                    System.out.print(x[a] + " ");
                }    
            }
              System.out.println("pilihan tidak ada");  
            }
            
        
}
