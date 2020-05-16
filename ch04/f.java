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
public class f {
    public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        
        for (int a = 0; a < 12; a++){
            int b = x[a] % 2;
            if (b == 1){
                int p = x[a - 1];
                b = p % 2;
                if (b == 0){
                    int q = x[a + 1];
                    b = q % 2;
                    if (b == 0){
                        System.out.print("angka ganjil yang diapit angka genap = ");
                        System.out.println(" " + x[a] + " ");
                        System.out.println("angka sebelumnya yaitu " + p);
                        System.out.println("angka sesudahnya yaitu " + q);
                        System.out.println();
                    }
                    
                }
            }
        }
    }
}