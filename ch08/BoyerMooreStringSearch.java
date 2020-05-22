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
public class BoyerMooreStringSearch {
    public static int nomor = 256; 
    public static int p (int a, int b) {
        return (a > b)? a: b; 
    } 
    public static void neo( char []bm, int size,int src[]){ 
        int z; 
        for (z = 0; z < nomor; z++) 
           src[z] = -1; 
  
        for (z = 0; z < size; z++) 
           src[(int) bm[z]] = z; 
    } 
    static void search( char bts[],  char exo[]) { 
        int v = exo.length; 
        int n = bts.length; 
  
        int badchar[] = new int[nomor]; 

        neo(exo, v, badchar); 
  
        int s = 0;  
        while(s <= (n - v)) { 
            int j = v-1; 
            while(j >= 0 && exo[j] == bts[s+j]) 
                j--; 
            if (j < 0){ 
                System.out.println("PATTERN PADA INDEKS KE  = " + s); 
                s += (s+v < n)? v-badchar[bts[s+v]] : 1; 
            } 
                s += p(1, j - badchar[bts[s+j]]); 
        } 
    } 
    public static void main(String []args) { 
          
        char lcs[] = "ABABABCBACABC".toCharArray(); 
        char v [] = "ABC".toCharArray(); 
        search(lcs, v); 
    } 
}  