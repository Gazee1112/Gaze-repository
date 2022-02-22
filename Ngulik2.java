package com.tutorial04;

import com.tutorial04.Mahasiswa;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main04 {
    public static void main(String[] args){
        //Inisialisasi Object
        Mahasiswa mahasiswa1 = new Mahasiswa("Ajun","215150700111038","Teknologi Informasi");

    }
    
}
