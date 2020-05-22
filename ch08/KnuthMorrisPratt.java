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
public class KnuthMorrisPratt {
    void KMPSearch(String sf, String byz) { 
        int v = sf.length(); 
        int t = byz.length(); 
        int bts[] = new int[v]; 
        int j = 0; 
        computeLPSArray(sf, v, bts); 
  
        int l = 0; 
        while (l < t) { 
            if (sf.charAt(j) == byz.charAt(l)){ 
                j++; 
                l++; 
            } 
            if (j == v) { 
                System.out.println("pattern ditemukan pada indeks ke " + (l - j)); 
                j = bts[j - 1]; 
            } 
            else if (l < t && sf.charAt(j) != byz.charAt(l)) { 
                if (j != 0) 
                    j = bts[j - 1]; 
                else
                    l = l + 1; 
            } 
        } 
    } 
  
    void computeLPSArray(String pat, int M, int lps[]) { 
        int len = 0; 
        int i = 1; 
        lps[0] = 0; 
        while (i < M) { 
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else { 
                if (len != 0) { 
                    len = lps[len - 1]; 
                } 
                else { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
    public static void main(String args[]){ 
        String byz = "ABCAAABCBCABCAABCBBACACB"; 
        String sf = "ABC"; 
        new KnuthMorrisPratt().KMPSearch(sf, byz); 
    } 
}