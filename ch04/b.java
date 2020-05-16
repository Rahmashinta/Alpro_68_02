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
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        int [] x = {82, 12,41, 38, 19, 26,9, 48, 20, 55, 8, 32, 3};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan urutan array yang diinginkan");
        int urutan = sc.nextInt();
        
        for (int a = 0; a < x.length; a++){
            if (a == urutan){
              System.out.println("urutan array ke " + a + " yaitu " + x[a]);  
            }
        }
    }
}
