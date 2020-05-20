/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03;

/**
 *
 * @author Rahma
 */
import java.util.Scanner;
public class pembagiterkecilselain1dan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan bilangan = ");
        int bil = sc.nextInt();
        
        System.out.print("pembagi dari " + bil + " selain angka 1 dan 2 yaitu ");
        for (int a = 3; a <= bil; a++){
            int b = bil % a;
            if ( b ==0){
                System.out.print(a + " ");
            }
        }
    }
}
