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
public class AlgoritmaKadane {
    public static void main(String[] args) {
        int x [] = {-4,-3, 8, 9, 13, 15, 2, -11, -7, 6};
        
        int p = 0;
        int terbesar = 0;
            for ( int a = 0; a < x.length; a++){
                p += x[a];
                if ( p < 0){
                    p =0;
                }
                if ( terbesar < p){
                    terbesar = p;
                }
            }
            System.out.println("nilai maksimum array yaitu " + terbesar);
    }
}