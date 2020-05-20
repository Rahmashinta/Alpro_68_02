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
public class LongestCommonSubsequence {
 int P(char [] x, char y[], int a, int b){
        if ( a == 0 || b == 0)
            return 0;
        if (x [a-1] == y[b-1])
            return 1 + P(x, y, a-1, b - 1);
        else
            return max(P(x, y, a, b-1), P(x, y, a-1, b));
    }
    int max (int k,int l){
        return ( k > l)? k : l;
    }
    public static void main(String[] args) {
        LongestCommonSubsequence sc = new LongestCommonSubsequence();
        char x[] = { 'R', 'A', 'H', 'M', 'A'};
        char y[] = { 'S', 'H', 'I', 'N', 'T' , 'A'};
        
        int m = x.length;
        int n = y.length;
        
        System.out.println("jumlah array yang sama = " + " " + sc.P(x, y, m, n));
    
    }
}

        