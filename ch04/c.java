/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author Rahma
 */
public class c {
    public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.print("angka ganjil dari array tersebut adalah");
        for (int a = 0; a < x.length; a++){
            int b = x[a]% 2;
            if (b == 1){
                System.out.print(" " + x[a] + " " );
                
            }  
        }
    }
}