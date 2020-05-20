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
public class mergesort {
    public static void merge( int arr [], int mulai, int tengah, int akhir){
        int kiri = tengah - mulai + 1;
        int kanan = akhir - tengah;
        
        int LeftArray[] = new int [kiri];
        int RightArray[] = new int [kanan];
        
        
        for ( int a = 0; a < kiri; ++a)
            LeftArray [a] = arr[mulai + a];
        for (int b = 0; b < kanan; ++b)
            RightArray [b] = arr[tengah + 1 + b];
        
        
        int c = mulai;
        int i =0 , j = 0;
        while (i < kiri && j < kanan){
            if (LeftArray[i] <= RightArray[j]){
                arr[c] = LeftArray[i];
                i++;
            }else {
                arr[c] = RightArray[j];
                j++;
            }
                c++; 
        }
        while (i < kiri){
            arr[c] = LeftArray[i];
            i++;
            c++;
        }
        while (j < kanan){
            arr [c] = RightArray[j];
            j++;
            c++;
        }
    }
    void sort ( int arr [], int begin, int end){
        
        if ( begin < end){
            int middle =( begin + end)/2;
            sort(arr, begin, middle);
            sort(arr, middle +1, end);
            merge ( arr, begin, middle, end);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {12, 32, 87, 43, 12, 45, 65, 32, 77, 90};
        mergesort sc = new mergesort();
        sc.sort(arr, 0, arr.length-1);
        
        System.out.println(" susunan array setelah diurutkan  " + " ");
        
        for ( int i = 0; i < arr.length; i++){
            System.out.print("indeks ke " + i + " yaitu " + " ");
            System.out.println( arr[i] + " ");
            
        }
            System.out.println();
    }
}