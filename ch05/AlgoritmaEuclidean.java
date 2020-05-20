/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author Rahma
 */
import java.util.Scanner;
public class AlgoritmaEuclidean {
    public static void main(String[] args) {
        
        int pertama, kedua, p;
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan bilangan pertama ");
        pertama = sc.nextInt();
        
        System.out.println("masukkan bilangan kedua ");
        kedua = sc.nextInt();
        
        
        if ( kedua > pertama){
            p = kedua % pertama;
            while ( p !=  0){
            pertama = kedua;
            kedua = p;
            p = pertama % kedua;
        }
        System.out.println("FPB adalah " + kedua);
        }
            p = pertama % kedua;
            while ( p != 0){
                kedua = pertama;
                pertama = p;
                p =kedua % pertama;
            }
                System.out.println("FPB = " + pertama);
    }
}
