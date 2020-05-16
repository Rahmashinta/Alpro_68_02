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
public class l {
 public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("jumlah angka dengan angka setelahnya yang bernilai genap ");
        
        for (int a = 0; a < 12; a++){
            int p = a + 1;
            int q = x[p];
            int b;
            b = x[a] + q;
            
               int c = b % 2;
               if (c == 0){
                   
                   System.out.println("angka sebelumnya = " + x[a]);
                   System.out.println("angka setelahnya = " + q);
                   System.out.println("jumlah = " + b );
                   System.out.println();
               }
                    
                
            
            
        }
    }
}