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
public class SieveofAtkin {
    static int Sieve(int batas) { 
        if (batas > 2) 
            System.out.print(2 + " "); 
  
        if (batas > 3) 
            System.out.print(3 + " "); 
        boolean atkin[] = new boolean[batas]; 
  
        for (int i = 0; i < batas; i++) 
            atkin[i] = false; 
        for (int a = 1; a * a < batas; a++) { 
            for (int b = 1; b * b < batas; b++) { 
                int p = (4 * a * a) + (b * b); 
                if (p <= batas && (p % 12 == 1 || p % 12 == 5)) 
  
                    atkin[p] ^= true; 
  
                p = (3 * a * a) + (b * b); 
                if (p <= batas && p % 12 == 7) 
                    atkin[p] ^= true; 
  
                p = (3 * a * a) - (b * b); 
                if (a > b && p <= batas && p % 12 == 11) 
                    atkin[p] ^= true; 
            } 
        } 
        for (int c = 5; c * c < batas; c++) { 
            if (atkin[c]) { 
                for (int d = c * c; d < batas; 
                     d += c * c) 
                    atkin[d] = false; 
            } 
        } 
        for (int e = 5; e < batas; e++) 
            if (atkin[e]) 
                System.out.print(e + " "); 
        return 0; 
    } 
    public static void main(String[] args) { 
        int limit = 50; 
        System.out.println("bilangan prima sampai angka " + limit + " yaitu ");
        Sieve(limit); 
        System.out.println();
    } 
} 
  