/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch02;

/**
 *
 * @author USER
 */
public class ObjectJurusan {
    public static void main(String[] args) {
        Jurusan j1 = new Jurusan();
        Jurusan j2 = new Jurusan();
        Jurusan j3 = new Jurusan();
        
        j1.nama = "Teknik Informatika";
        j1.akreditasi = " A";
        j1.jumlahmahasiswa = 1200;
        
        j2.nama = "Sistem Informasi";
        j2.akreditasi = "A";
        j2.jumlahmahasiswa = 1090;
        
        j3.nama = "Teknik Elektro";
        j3.akreditasi = "A";
        j3.jumlahmahasiswa = 750;
        
        System.out.println("Juurusan 1");
        System.out.println("Nama = " + j1.getNama());
        System.out.println("Akreditasi = " + j1.getAkreditasi());
        System.out.println("Jumlah = " + j1.getJumlahMahasiswa());
        
        System.out.println("Juurusan 2");
        System.out.println("Nama = " + j2.getNama());
        System.out.println("Akreditasi = " + j2.getAkreditasi());
        System.out.println("Jumlah = " + j2.getJumlahMahasiswa());
        
        System.out.println("Juurusan 3");
        System.out.println("Nama = " + j3.getNama());
        System.out.println("Akreditasi = " + j3.getAkreditasi());
        System.out.println("Jumlah = " + j3.getJumlahMahasiswa());
    }
}
