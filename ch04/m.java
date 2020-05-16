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
public class m {
        public static void main(String[] args) {
      
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        int selisih;
        int jumlah =0;
        for (int a = 0; a < 12; a++){
            int p = a + 1;
            int b;
            b = x[p];
            
                selisih = x[a] - b;
                jumlah = jumlah + selisih;
                System.out.println();
                System.out.println("array indeks ke " + a + " = " + x[a]);
                System.out.println("array indeks ke " + p + " = " + x[p]);
                System.out.println("selisih antara kedua array = " + selisih);
                
                System.out.println("jumlah selisih menjadi = " + jumlah);
            
        }
    }
}