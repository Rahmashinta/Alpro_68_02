/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author Rahma
 */
public class LongestIncreasingSubseuence {
    public static int tes ( int arr[], int n){
        int tes[] = new int[n];
        int a, b,max = 0;
        
        for ( a = 0; a < arr.length; a++)
            tes [a] = 1;
        for ( a = 1; a < arr.length; a++)
            for ( b = 0; b < a; b++)
                if ( arr [a] > arr[b] && tes[a] < tes[b] + 1)
                        tes [a] = tes [b] + 1;
        
        for( a =0; a < arr.length; a++)
            if (max < tes[a])
                max = tes[a];
                
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {11, 39, 29, 17, 3, 45, 35, 58};
        int n = arr.length;
        System.out.println("panjang = " + tes(arr, n) + "\n ");
    }
}
