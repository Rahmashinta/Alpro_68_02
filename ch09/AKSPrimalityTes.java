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
public class AKSPrimalityTes {
    public static long a[] = new long[100]; 
    public static void AKS(int i) { 
        a[0] = 1; 
        for (int P = 0; P < i; a[0] = -a[0], P++) { 
            a[1 + P] = 1; 
  
            for (int Q = P; Q > 0; Q--) 
                a[Q] = a[Q - 1] - a[Q]; 
        } 
    }
    public static boolean isPrime(int j) { 
        AKS(j); 
        a[0]++; 
        a[j]--; 
        int r = j; 
        while ((r--) > 0 && a[r] % j == 0) ; 
        return r < 0; 
    } 
    public static void main(String[] args) { 
        int n = 23; 
        if (isPrime(n)) 
            System.out.println(n + " Prima"); 
        else
            System.out.println(n + " bukan prima"); 
    } 
} 
