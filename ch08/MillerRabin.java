/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08;

/**
 *
 * @author Rahma
 */
public class MillerRabin {
    public static int MR(int a, int b, int p) { 
          
        int rab = 1; 
        a = a % p;  
        while (b > 0) { 
            if ((b & 1) == 1) 
                rab = (rab * a) % p; 
                b = b >> 1; 
                a = (a * a) % p; 
        }   
            return rab; 
    } 
    public static boolean miller(int c, int q) { 
        int a = 2 + (int)(Math.random() % (q - 4)); 
        int x = MR(a, c, q); 
      
        if (x == 1 || x == q - 1) 
            return true; 
        while (c != q - 1) { 
            x = (x * x) % q; 
            c = c * 2; 
          
            if (x == 1) 
                return false; 
            if (x == q - 1) 
                return true; 
        } 
            return false; 
    } 
    public static boolean Prima(int n, int k) { 
        
        if (n <= 1 || n == 4) 
            return false; 
        if (n <= 3) 
            return true; 
        int d = n - 1; 
          
        while (d % 2 == 0) 
            d /= 2; 
        for (int i = 0; i < k; i++){
            if (!miller(d, n)) {
                return false;
            }
        }
            return true; 
    } 
    public static void main(String args[]) { 
          
        int k = 4; 
      
        System.out.println("semua bilangan prima dibawah 100: "); 
                                  
        for (int n = 1; n < 100; n++){
            if (Prima(n, k)) {
                System.out.print(n + " "); 
            }
        }  
    } 
} 
