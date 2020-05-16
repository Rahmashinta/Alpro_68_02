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
public class k {
    public static void main(String[] args) {
        
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        
        
        for (int a = 0; a < 12; a++){ 
            int p = a + 1;
            int b = x[p];
                
                if( x[a] < b){
                    System.out.print("bilangan yang setelahnya lebih besar yaitu = ");
                    System.out.println(x[a]);
                    System.out.println("indeks ke " + a + " yaitu " + x[a]);
                    System.out.println("indeks ke " + p + " yaitu " + x[p]);
                    System.out.println("bilangan setelah indeks ke " + a + " lebih besar");
                    System.out.println();
                } 
        }   
    }        
}
    
