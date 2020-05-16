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
public class j {
  public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };
        
        System.out.println("selisih angka genap dengan angka genap setelahnya yaitu ");
        
        for (int a = 0; a < x.length; a++){
                           
                int q = x[a];
                int c = q % 2;
            if (c == 0){
                
                int p = a + 1;
                int b = x[p]; 
                if( b % 2 == 0){
                    int selisih ;
                    
                    selisih = x[a] - x[p];
                    System.out.println("angka sebelum = " + x[a]);
                    System.out.println("angka sesudah = " + b);
                    System.out.println("selisih = " +selisih);
                    System.out.println();
                }
            
            }
            
        }
    }

}