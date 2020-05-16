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
public class i {
    public static void main(String[] args) {
      
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        int selisih;
        for (int a = 0; a < 12; a++){
           
            int c = a + 1;
            int b = x[c];
            
                selisih = x[a] - b;
                    
                    System.out.println("indeks ke " + a + " yaitu = " + x[a]);
                    System.out.println("indeks ke " + c + " yaitu = " + x[c]);
                    System.out.println("selisih = " + selisih);
                    System.out.println();
        }
    }
}