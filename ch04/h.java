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
public class h {
    public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;
        for (int a = 0; a < x.length; a++){
            
            jumlah += x[a];
            
        }
        System.out.print("jumlah angka didalam array tersebut = " + jumlah +" " );
    }
}