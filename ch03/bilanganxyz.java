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
public class bilanganxyz {
    public static void main(String[] args) {
        int x,y,z;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        x = sc.nextInt();
        
        System.out.println("y = ");
        y = sc.nextInt();
        
        System.out.println("z = ");
        z = sc.nextInt();
                
            if (x > y && x > z){
                System.out.println("x adalah bilangan terbesar");
            }else {
                if (y > x && y > z){
                    System.out.println("y adalah bilangan terbesar");
                }else {
                    System.out.println("z adalah bilangan terbesar");
                }
        }
    }
}
