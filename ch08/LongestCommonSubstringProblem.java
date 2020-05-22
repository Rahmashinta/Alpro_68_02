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
public class LongestCommonSubstringProblem {
    public static int LCSP(char X[], char Y[], int i, int j)  {        
        int p[][] = new int[i + 1][j + 1]; 
        int cs = 0;  
        for (int a = 0; a <= i; a++) { 
            for (int b = 0; b <= j; b++) { 
                if (a == 0 || b == 0) 
                    p[a][b] = 0; 
                else if (X[a - 1] == Y[b - 1]) { 
                    p[a][b] = p[a - 1][b - 1] + 1; 
                    cs = Integer.max(cs, p[a][b]); 
                } else
                    p[a][b] = 0; 
            } 
        } 
        return cs; 
    } 
    public static void main(String[] args){ 
        String X = "kakaktua"; 
        String Y = "kaktus"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Longest Common Substring adalah  " + 
                LCSP(X.toCharArray(), Y.toCharArray(), m, n)); 
        System.out.println();
    } 
} 

