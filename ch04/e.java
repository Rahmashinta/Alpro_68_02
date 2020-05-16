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
public class e {
    public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.print("angka yang mengandung angka 2 didalamnya yaitu ");
        String hasil = "2";
        for (int a = 0; a < x.length; a++){
            if(String.valueOf(x[a]).startsWith(hasil) | String.valueOf(x[a]).endsWith(hasil)){
                
                System.out.print(x[a]+ " ");
            }
        }
    }
}