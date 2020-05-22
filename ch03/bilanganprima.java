/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch03;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class bilanganprima {
    public static void main(String[] args) {
        int bil;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan bilangan yang ingin dicek : ");
        bil = sc.nextInt();
        
        int z;
        int p = 0;
        boolean prima = true;
        for (int a = 2; a <= bil; a++){
            z = bil % a;
            if(z == 0){
                p++;
                }
            }
        if ( p == 1 ){
            System.out.println(bil + " adalah bilangan prima");
        }else{
            System.out.println(bil + " bukan bilangan prima");
        }
        System.out.println();
    }
        
}
