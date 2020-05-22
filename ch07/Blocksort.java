/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;

/**
 *
 * @author Rahma
 */
public class Blocksort {
    public static void main(String[]args){
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.print("urutan array yaitu = ");
        int urutan = 0;
        for(int a = 0; a < x.length; a++){
            for(int b = 0; b < x.length; b++){
                if (x[a] < x[b]){
                    urutan = x [a];
                    x[a] = x[b];
                    x[b] = urutan;
                }
            }
        }
        
        for(int a = 0; a < x.length; a++){
            System.out.print(x[a] +" ");
            
        }
            System.out.println();
    }
}