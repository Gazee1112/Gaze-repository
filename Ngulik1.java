package com.tutorial;

import com.tutorial.Mahasiswa;

// Pengenalan class dan object (Inisialisasi)
// Membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

}

public class Main03 {
    public static void main(String[] args){
        
        // Inisiasi atau membuat Object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.nama = "Ajun";
        mahasiswa1.NIM = "215150700111038";
        mahasiswa1.jurusan = "Teknologi Informasi";
        mahasiswa1.IPK = 3.85;
        mahasiswa1.umur = 19;
    
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        
        mahasiswa2.nama = "Bariq";
        mahasiswa2.NIM = "215150700111039";
        mahasiswa2.jurusan = "Teknologi Informasi";
        mahasiswa2.IPK = 3.70;
        mahasiswa2.umur = 20;
    
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        
        mahasiswa3.name = "Faza";
        mahasiswa3.NIM = "2151500700111044";
        mahasiswa3.jurusan = "Teknologi Informasi";
        mahasiswa3.IPK = "3.69";
        mahasiswa3.umur = "19";
        
        System.out.println(mahasiswa3.nama);
        System.out.println(mahasiswa3.NIM);
        System.out.println(mahasiswa3.jurusan);
        System.out.println(mahasiswa3.IPK);
        System.out.println(mahasiswa3.umur);
        
        
    }
}    
