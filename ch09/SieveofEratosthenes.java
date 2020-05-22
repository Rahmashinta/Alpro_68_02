/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09;

/**
 *
 * @author Rahma
 */
public class SieveofEratosthenes {
    void Eratosthenes(int a) {  
        boolean prima[] = new boolean[a+1]; 
        for(int p = 0; p < a; p++) 
            prima[p] = true; 
          
        for(int q = 2; q * q <= a; q++) { 
            if(prima[q] == true) { 
                for(int r = q * q; r <= a; r += q) 
                    prima[r] = false; 
            } 
        } 
        for(int l = 2; l <= a; l++) { 
            if(prima[l] == true) 
                System.out.print(l + " "); 
        } 
    } 
    public static void main(String args[]) { 
        int n = 30; 
        System.out.print("bilangan prima yang lebih kecil dari " + n +" yaitu ");
        SieveofEratosthenes sc = new SieveofEratosthenes(); 
        sc.Eratosthenes(n); 
    } 
}