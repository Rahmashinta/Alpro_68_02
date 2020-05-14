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
public class bilanganxdany {
    public static void main(String[] args) {
        int x,y;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("x :");
        x = sc.nextInt();
        
        System.out.println("y :");
        y = sc.nextInt();
        
            if (x > y){
                System.out.println("nilai x lebih besar dari y");
            
            }else{
                System.out.println("nilai y lebih besar dari x");
            }
    }
}
