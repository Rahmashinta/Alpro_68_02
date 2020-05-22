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
import java.util.Arrays;
public class SieveofSundaram {
    static int Sundaram(int p) { 
    int of = (p - 2) / 2; 
        boolean sieve[] = new boolean[of + 1]; 
        Arrays.fill(sieve, false); 
        for (int a = 1; a <= of; a++) 
            for (int b = a; (a + b + 2 * a * b) <= of; b++) 
                sieve[a + b + 2 * a * b] = true; 

        if (p > 2) 
        System.out.print(2 + " "); 

        for (int c = 1; c <= of; c++) 
            if (sieve[c] == false) 
                System.out.print(2 * c + 1 + " "); 
        return -1; 
    } 
    public static void main(String[] args) { 
    int n = 100; 
        System.out.println("bilangan prima dibawah angka " + n + " yaitu ");
    Sundaram(n); 
        System.out.println();
    } 
} 