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
public class g {
   public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.print("angka kelipatan 5 yang sebelumnya juga kelipatan 5 yaitu ");
        for (int a = 0; a < x.length; a++){
            int b = x[a] % 5;
            if (b == 0){
                int p = x[a-1];
                b = p % 5;
                if (b == 0){
                   
                    System.out.println("indeks ke " + a + " = " + x[a]+ " " );
                }
            }
            
        }
    }
}