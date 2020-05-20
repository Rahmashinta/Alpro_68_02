/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;

/**
 *
 * @author Rahma
 */
public class Cocktailsort {
       
    public static void Cocktail(int a[], int n)  {  
        boolean tukar = true;  
        int mulai = 0,i;  
        int akhir = n - 1;  
        int p;

        tukar = false;  
            for (i = mulai ; i < akhir ; i++) {  
                if (a[i] > a[i + 1]){  
                    p = a[i];  
                    a[i] = a[i+1];  
                    a[i+1] = p;                  
                    tukar = true;          
                }      
            }  
            if (!tukar)  

        tukar = false;  
            for (i = akhir - 1; i >= mulai; i--) {  
                if (a[i] > a[i + 1]){  
                    p = a[i];  
                    a[i] = a[i+1];  
                    a[i+1] = p;  
                    tukar = true;  
                }  
            }  
        mulai++;      
             
    }  
    public static void main(String[] args) {  

        int arr[] = {12, 7, 36, 43, 23, 1, 9, 78},i;  
        int n = arr.length;  
        Cocktailsort sc = new Cocktailsort();
        sc.Cocktail(arr, n);  
        System.out.println("urutan array :\n");  
            
            for (i = 0; i < n; i++)  
                System.out.print(arr[i]+" ");  
                System.out.println();  
    }  
}  


